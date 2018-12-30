package com.duiya.usersjpatest;

import com.duiya.Main;
import com.duiya.dao.UsersJAPSpecifiationExecutor;
import com.duiya.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)
public class UsersJPAspecifiationExecutorTest {
    @Autowired
    private UsersJAPSpecifiationExecutor usersJAPSpecifiationExecutor;

    @Test
    public void jpaSpecificationExecutorTest1(){
        Specification<Users> specification = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<>();
                list.add(criteriaBuilder.equal(root.get("name"), "对呀"));
                list.add(criteriaBuilder.equal(root.get("age"), 20));
                Predicate[] arr = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(arr));
            }
        };
        List<Users> list = this.usersJAPSpecifiationExecutor.findAll(specification);
        Iterator<Users> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void jpaSpecificationExecutorTest2(){
        Specification<Users> specification = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.and(criteriaBuilder.equal(root.get("name"), "对呀"),
                        criteriaBuilder.equal(root.get("age"), 20));
            }
        };
        List<Users> list = this.usersJAPSpecifiationExecutor.findAll(specification);
        Iterator<Users> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void jpaSpecificationExecutorTest3(){
        Specification<Users> specification = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.or(criteriaBuilder.and(criteriaBuilder.equal(root.get("name"), "对呀"),
                                                              criteriaBuilder.equal(root.get("age"), 20)),
                                          criteriaBuilder.equal(root.get("address"), "重庆"));
            }
        };
        List<Users> list = this.usersJAPSpecifiationExecutor.findAll(specification);
        Iterator<Users> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void jpaSpecificationExecutorTest4(){
        Specification<Users> specification = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.or(criteriaBuilder.and(criteriaBuilder.equal(root.get("name"), "对呀"),
                        criteriaBuilder.equal(root.get("age"), 20)),
                        criteriaBuilder.equal(root.get("address"), "重庆"));
            }
        };
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "age"));
        Pageable pageable = new PageRequest(0, 3, sort);
        Page<Users> page = this.usersJAPSpecifiationExecutor.findAll(specification, pageable);
        System.out.println(page.getTotalElements() + " " + page.getTotalPages());
        Iterator<Users> iterator = page.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

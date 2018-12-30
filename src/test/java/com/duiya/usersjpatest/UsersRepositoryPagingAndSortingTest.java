package com.duiya.usersjpatest;

import com.duiya.Main;
import com.duiya.dao.UsersPagingAndSorttingRepository;
import com.duiya.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)
public class UsersRepositoryPagingAndSortingTest {
    @Autowired
    private UsersPagingAndSorttingRepository pagingAndSorttingRespository;

    @Test
    public void sortTest(){
        Sort.Order order = new Sort.Order(Sort.Direction.ASC, "id");
        Sort sort = new Sort(order);
        List<Users> list = (List<Users>)pagingAndSorttingRespository.findAll(sort);
        Iterator<Users> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void pageTest(){
        //Pageable 首页从0开始
        Pageable pageable = new PageRequest(0, 3);
        Page<Users> page = this.pagingAndSorttingRespository.findAll(pageable);
        System.out.println(page.getTotalElements() + " " + page.getTotalPages());
        Iterator<Users> iterator = page.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void sortAndPageTest() {
        Sort sort = new Sort(new Sort.Order(Sort.Direction.DESC, "age"));
        Pageable pageable = new PageRequest(0, 3, sort);
        Page<Users> page = this.pagingAndSorttingRespository.findAll(pageable);
        System.out.println(page.getTotalElements() + " " + page.getTotalPages());
        Iterator<Users> iterator = page.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

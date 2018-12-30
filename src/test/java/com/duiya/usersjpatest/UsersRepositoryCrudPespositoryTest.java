package com.duiya.usersjpatest;

import com.duiya.Main;
import com.duiya.dao.UsersRepositoryCrudRepository;
import com.duiya.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Main.class})
public class UsersRepositoryCrudPespositoryTest {
    @Autowired
    private UsersRepositoryCrudRepository usersRespositoryCrudRespository;

    @Test
    public void testSave(){
        Users user = new Users();
        user.setName("来了老弟");
        user.setAge(24);
        user.setAddress("重庆");
        this.usersRespositoryCrudRespository.save(user);
    }

    @Test
    public void testFind(){
        Optional<Users> optional = this.usersRespositoryCrudRespository.findById(1);
        System.out.println(optional.toString());
        List<Users> list = (List<Users>)this.usersRespositoryCrudRespository.findAll();
        Iterator<Users> iterator = list.iterator();
        while(iterator.hasNext()){
            Users users = iterator.next();
            System.out.println(users.toString());
        }
        for(Users users : list){
            System.out.println(users.toString());
        }
    }

    @Test
    public void TestDelete(){
        Users user = new Users();
        user.setName("来了老弟");
        this.usersRespositoryCrudRespository.delete(user);
    }

    @Test
    public void TestUpdate(){
        Users users = new Users();
        users.setName("来了老弟啊");
        users.setAddress("北京");
        users.setId(7);
        users.setAge(3);
        this.usersRespositoryCrudRespository.save(users);
    }



}

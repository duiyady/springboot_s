package com.duiya.usersjpatest;

import com.duiya.Main;
import com.duiya.dao.UsersRepository;
import com.duiya.dao.UsersRespositoryByName;
import com.duiya.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Main.class})
public class UsersRespositoryTest {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UsersRespositoryByName usersRespositoryByName;

    @Test
    public void testSave(){
        Users users = new Users();
        users.setAdress("山东");
        users.setAge(39);
        users.setName("哇咔咔");
        this.usersRepository.save(users);
    }

    @Test
    public void findByName(){
        List<Users> list = usersRespositoryByName.findByName("对呀");
        System.out.println(list);
    }

    @Test
    public void findByNameAndAge(){
        List<Users> list = usersRespositoryByName.findByNameAndAge("对呀", 40);
        System.out.println(list);
    }

    @Test
    public void findByNameLike(){
        List<Users> list = usersRespositoryByName.findByNameLike("对%");
        System.out.println(list);
    }



}

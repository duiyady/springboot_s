package com.duiya.usersjpatest;

import com.duiya.Main;
import com.duiya.dao.UsersRepository;
import com.duiya.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Main.class})
public class UsersRespositoryTest {
    @Autowired
    private UsersRepository usersRepository;

    @Test
    public void testSave(){
        Users users = new Users();
        users.setAdress("重庆");
        users.setAge(10);
        users.setName("对呀");
        this.usersRepository.save(users);
    }

}

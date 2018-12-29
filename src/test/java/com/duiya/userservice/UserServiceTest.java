package com.duiya.userservice;

import com.duiya.Main;
import com.duiya.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={Main.class})
public class UserServiceTest {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Test
    public void testAddUser(){
        this.userServiceImpl.getAll();
    }
}

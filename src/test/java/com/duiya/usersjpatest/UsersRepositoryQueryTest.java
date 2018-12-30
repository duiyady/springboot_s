package com.duiya.usersjpatest;

import com.duiya.Main;
import com.duiya.dao.UsersRepositoryQueryAnnotation;
import com.duiya.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Main.class})
public class UsersRepositoryQueryTest {
    @Autowired
    private UsersRepositoryQueryAnnotation usersRespositoryQuery;

    @Test
    public void queryByNaneUseSql(){
        List<Users> list = this.usersRespositoryQuery.queryByNameUseSql("对呀");
        System.out.println(list);
    }

    @Test
    @Transactional
    public void updateUsersNameById(){
        this.usersRespositoryQuery.updateUsersNameById("对", 1);
    }
}

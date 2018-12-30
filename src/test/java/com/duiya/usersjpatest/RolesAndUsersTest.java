package com.duiya.usersjpatest;

import com.duiya.Main;
import com.duiya.dao.RolesRepository;
import com.duiya.dao.UsersRepository;
import com.duiya.pojo.Menus;
import com.duiya.pojo.Roles;
import com.duiya.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)
public class RolesAndUsersTest {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RolesRepository rolesRepository;

    /**
     * 一对多关联关系添加
     */
    @Test
    public void oneToMany(){
        Users user = new Users();
        user.setAge(36);
        user.setAddress("天津");
        user.setName("小刚");

        Roles role = new Roles();
        role.setRolename("管理员");

        role.getUsers().add(user);
        user.setRoles(role);

        usersRepository.save(user);
    }

    @Test
    public void oneToManyFind(){
        Optional<Users> optional = usersRepository.findById(11);
        Users users = optional.get();
        Roles roles = users.getRoles();
        System.out.println(roles.getRolename());
        System.out.println(users);
    }

    @Test
    public void manyToMany(){
        Roles roles = new Roles();
        roles.setRolename("项目经理");

        Menus menus = new Menus();
        menus.setMenusname("xxxx管理系统");
        menus.setFatherid(0);

        Menus menus1 = new Menus();
        menus1.setFatherid(1);
        menus1.setMenusname("项目管理");

        roles.getMenus().add(menus);
        roles.getMenus().add(menus1);

        menus.getRoles().add(roles);
        menus1.getRoles().add(roles);

        rolesRepository.save(roles);

    }

    @Test
    public void manyToManyFind(){
        Optional<Roles> optional = rolesRepository.findById(2);
        Roles roles = optional.get();
        System.out.println(roles.toString());
        //System.out.println(roles.getMenus());

    }

}

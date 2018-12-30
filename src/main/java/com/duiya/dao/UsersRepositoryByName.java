package com.duiya.dao;

import com.duiya.pojo.Users;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * 这个接口主要提供查询
 */
public interface UsersRepositoryByName extends Repository<Users, Integer> {

    //findBy + 属性名称 + 查询条件 首字母大写
    List<Users> findByName(String name);

    List<Users> findByNameAndAge(String name, Integer age);

    List<Users> findByNameLike(String name);


}

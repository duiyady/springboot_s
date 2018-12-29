package com.duiya.dao;

import com.duiya.pojo.Users;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UsersRespositoryQueryAnnotation extends Repository<Users, Integer> {
    @Query("from Users where name = :name")
    List<Users> queryByNameUseHQL(String name);

    @Query(value = "select * from t_users where name = ?", nativeQuery = true)
    List<Users> queryByNameUseSql(String name);

    @Query(value = "update t_users set name = ? where id = ?", nativeQuery = true)
    @Modifying
    void updateUsersNameById(String name, Integer id);
}

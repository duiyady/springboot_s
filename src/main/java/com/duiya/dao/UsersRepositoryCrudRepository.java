package com.duiya.dao;

import com.duiya.pojo.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * CrudRespository继承了Respository接口
 */
public interface UsersRepositoryCrudRepository extends CrudRepository<Users, Integer> {

}

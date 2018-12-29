package com.duiya.mapper;

import com.duiya.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


public interface UserMapper {
    void insert(User user);

    List<Map<String, Object>> getAll();

}

package com.duiya.mapper;

import com.duiya.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface UserMapper {
    int insert(User user);

    List<Map<String, Object>> getAll();

}

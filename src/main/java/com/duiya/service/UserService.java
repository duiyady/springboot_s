package com.duiya.service;

import com.duiya.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    void addUser(User user);

    List<Map<String, Object>> getAll();
}

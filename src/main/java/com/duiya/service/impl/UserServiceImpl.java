package com.duiya.service.impl;

import com.duiya.mapper.UserMapper;
import com.duiya.pojo.User;
import com.duiya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        int result = userMapper.insert(user);
        return result;
    }

    @Override
    public List<Map<String, Object>> getAll() {
        return userMapper.getAll();
    }
}

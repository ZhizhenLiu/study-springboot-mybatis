package com.zhizhen.test.springboot_mybatis.service;

import com.zhizhen.test.springboot_mybatis.mapper.UserMapper;
import com.zhizhen.test.springboot_mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> sel()
    {
        return userMapper.sel();
    }

    public int insert(String name, String password)
    {
        return userMapper.insert(name,password);
    }
}

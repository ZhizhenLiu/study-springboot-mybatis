package com.zhizhen.test.springboot_mybatis.service;

import com.zhizhen.test.springboot_mybatis.mapper.UserMapper;
import com.zhizhen.test.springboot_mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private UserMapper userMapper;

    public int insert(String username,String password)
    {
        User user = new User(username,password);
        return userMapper.insert(user);
    }

    public User selectByUsername(String username)
    {
        return userMapper.selectByPrimaryKey(username);
    }

    public List<User> selctAll()
    {
        return userMapper.selectAll();
    }

    public int deleteByUsername(String username)
    {
        return userMapper.deleteByPrimaryKey(username);
    }
}

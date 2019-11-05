package com.zhizhen.test.springboot_mybatis.service;

import com.zhizhen.test.springboot_mybatis.mapper.UserMapper2;
import com.zhizhen.test.springboot_mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService2 {

    @Autowired
    private UserMapper2 userMapper2;

    public List<User> select()
    {
        return userMapper2.select();
    }

    public int insert(String username, String password)
    {
        User user = new User(username,password);
        return userMapper2.insert(user);
    }
}

package com.zhizhen.test.springboot_mybatis.controller;

import com.zhizhen.test.springboot_mybatis.model.User;
import com.zhizhen.test.springboot_mybatis.service.UserService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testBoot")
public class UerController2 {

    @Autowired
    private UserService2 userService2;

    @RequestMapping("/select2")
    public List<User> select()
    {
        return userService2.select();
    }

    @RequestMapping("insert2")
    public int insert(@RequestParam(value = "username") String username,
                      @RequestParam(value = "password") String password)
    {
        return userService2.insert(username,password);
    }
}

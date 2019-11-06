package com.zhizhen.test.springboot_mybatis.controller;

import com.zhizhen.test.springboot_mybatis.model.User;
import com.zhizhen.test.springboot_mybatis.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testBoot")
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping("/insert")
    public int insert(@RequestParam(value ="username") String username,
                      @RequestParam(value = "password") String password)
    {
        return service.insert(username, password);
    }

    @RequestMapping("/select")
    public User select(@RequestParam(value = "username") String username)
    {
        return service.selectByUsername(username);
    }

    @RequestMapping("/selectAll")
    public List<User> selectAll()
    {
        return service.selctAll();
    }

    @RequestMapping("/delete")
    public int deleteByUsername(String username)
    {
        return service.deleteByUsername(username);
    }
}

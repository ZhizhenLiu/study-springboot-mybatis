//package com.zhizhen.test.springboot_mybatis.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/testBoot")
//public class UserController
//{
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping(value = "/select")
//    public List<User> getUser()
//    {
//        return userService.sel();
//    }
//
//    @RequestMapping(value = "/insert")
//    public int insert(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password)
//    {
//        return userService.insert(username, password);
//    }
//}

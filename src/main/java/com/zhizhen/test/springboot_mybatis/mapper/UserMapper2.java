package com.zhizhen.test.springboot_mybatis.mapper;

import com.zhizhen.test.springboot_mybatis.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper2 {

    List<User> select();

    int insert(User user);
}

package com.zhizhen.test.springboot_mybatis.mapper;

import com.zhizhen.test.springboot_mybatis.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from user")
    List<User> sel();

    @Insert("insert into user(username, password) values(#{username},#{password})")
    int insert(@Param("username") String username,@Param("password") String password);
}

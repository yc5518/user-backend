package com.demo.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.model.User;

@Mapper
public interface UserMapper {
    int insert(User record);

    User selectUser(String id);
    
    List<User> queryUserList(String name);
    
    int updateUser(User user);
}
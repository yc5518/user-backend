package com.demo.service.inf;

import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.model.UserList;

@Service
public interface IUserService {
	User queryUser(String id) throws Exception;
	UserList queryUserList(String name) throws Exception;
	int updateUser(User user)  throws Exception;
}

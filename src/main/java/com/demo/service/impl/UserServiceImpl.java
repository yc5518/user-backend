package com.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.UserMapper;
import com.demo.model.User;
import com.demo.model.UserList;
import com.demo.service.inf.IUserService;
import com.mysql.jdbc.StringUtils;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper mapper;

	@Override
	public User queryUser(String id) throws Exception {
		try {

			return mapper.selectUser(id);

		} catch (Exception e) {
			// should log first, then throws exception;
			throw new Exception(e);
		}
	}

	@Override
	public UserList queryUserList(String name) throws Exception {

		UserList userList = new UserList();

		try {
			String codedName = null;
			if(!StringUtils.isNullOrEmpty(name)) {
				codedName = name.trim();
				codedName = codedName.length()>0?codedName:null;	
			}
			
			List<User> list = mapper.queryUserList(codedName);
			userList.setUserList(list);

		} catch (Exception e) {
			// should log first, then throws exception;
			throw new Exception(e);
		}

		return userList;
	}

	@Override
	public int updateUser(User user) throws Exception {
		int success = -1;
		try {
			success = mapper.updateUser(user);

		} catch (Exception e) {
			// should log first, then throws exception;
			throw new Exception(e);
		}
		return success;
	}

	public void setMapper(UserMapper mapper) {
		this.mapper = mapper;
	}

}

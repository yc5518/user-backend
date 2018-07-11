package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.model.UserList;
import com.demo.service.inf.IUserService;

@RestController
@RequestMapping(value = "/demo/v1")
public class UserROA{
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/users",method = RequestMethod.GET)
    public UserList getUserList(@RequestParam(value="name", required = false) String name) throws Exception{
		UserList userList;
		try {
			userList = userService.queryUserList(name);
		} catch (Exception e) {
			throw e;
		}
		return userList;
    }
	
	@RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    public User getUserInfo(@PathVariable("id") String id) throws Exception{
		
		try {
			return userService.queryUser(id);
		} catch (Exception e) {
			throw e;
		}
    }
	
	@RequestMapping(value = "/users/{id}",method = RequestMethod.PUT)
    public int updateUser(@PathVariable("id") String id,@RequestBody User user) throws Exception{
		int success = -1;
		try {
			success = userService.updateUser(user);
		} catch (Exception e) {
			throw e;
		}
		return success;
    }

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
}

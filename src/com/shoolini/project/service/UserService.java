package com.shoolini.project.service;

import java.util.List;

import com.shoolini.project.dto.User;

public interface UserService {
	
	boolean addUser(User user);
	boolean updateUser(User user);
	boolean deleteUser(String email);
	List<User> showAllUser();
	User searchUser(String email);

}

package com.shoolini.project.service.impl;

import java.util.List;

import com.shoolini.project.dao.UserDao;
import com.shoolini.project.dao.impl.UserDaoImpl;
import com.shoolini.project.dto.User;
import com.shoolini.project.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao = new UserDaoImpl();

	@Override
	public boolean addUser(User user) {
		System.out.println("From UserServiceImpl: "+user);
		boolean isUserAdded = userDao.addUser(user);
		return isUserAdded;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> showAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User searchUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}

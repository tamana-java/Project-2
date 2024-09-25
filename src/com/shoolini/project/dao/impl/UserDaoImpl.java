package com.shoolini.project.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.shoolini.project.dao.UserDao;
import com.shoolini.project.dto.User;
import com.shoolini.project.utility.DbConnection;

public class UserDaoImpl implements UserDao{
	
	private Connection con = null;
	private PreparedStatement ps = null;

	@Override
	public boolean addUser(User user) {
		System.out.println("From UserDaoImpl: "+user);
		try {
			con = DbConnection.getConnection();
			ps = con.prepareStatement("insert into tbl_user(first_name,last_name,email_id,password) values(?,?,?,?) ");
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			
			int rows = ps.executeUpdate();
			if(rows>0) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
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

package com.shoolini.project.controller;

import java.util.Scanner;

import com.shoolini.project.dto.User;
import com.shoolini.project.service.UserService;
import com.shoolini.project.service.impl.UserServiceImpl;

public class UserController {
	
	Scanner s = new Scanner(System.in);
	UserService userService = new UserServiceImpl();
	
	public void createUser() {
		System.out.println("Enter first name");
		String firstName = s.next();
		System.out.println("Enter last name");
		String lastName = s.next();
		System.out.println("Enter email id");
		String email = s.next();
		System.out.println("Enter password name");
		String pass = s.next();
		User user = new User(firstName, lastName, email, pass);
		boolean isUserCreated = userService.addUser(user);
		if(isUserCreated) {
			System.out.println("User created successfully...");
		}else {
			System.out.println("Something went wrong to create user...");
		}
	}

}

package com.shoolini.project.dashboard;

import java.util.Scanner;

import com.shoolini.project.controller.UserController;
import com.shoolini.project.dto.User;

public class FoodPlazaDashboard {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);

		int option1 = 0, option2 = 0;
		do {
			System.out.println("*********Welcome to Dashboard**********");
			System.out.println("=======================================");

			System.out.println(
					"Enter 1 for User\nEnter 2 for Food\nEnter 3 for Cart\nEnter 4 for Order\nEnter 5 to Exit");

			option1 = s.nextInt();
			switch (option1) {
			case 1:
				do {
					System.out.println("Enter 1 to add user\nEnter 2 to Update user\nEnter 3 to Delete User"
							+ "\nEnter 4 to View all Users\nEnter 5 to Search any user\nEnter 6 to Exit..");
					option2 = s.nextInt();
					switch(option2) {
					case 1:
						UserController uc = new UserController();
						uc.createUser();						
						break;
					case 2:
						System.out.println("User updated...");
						break;
					case 3:
						System.out.println("User Deleted...");
						break;
					case 4:
						System.out.println("All users displayed...");
						break;
					case 5:
						System.out.println("User found...");
						break;
					case 6:
						System.out.println("Exited from User module...\n");
						break;
					}
				}while(option2 != 6);
				
				
				break;
			case 2:
				System.out.println("Food Module is Ready....");
				break;
			case 3:
				System.out.println("Cart Module is Ready....");
				break;
			case 4:
				System.out.println("Food Order is Ready....");
				break;
			case 5:
				System.out.println("Exited....");
				break;
			}
		} while (option1 != 5);

	}

}

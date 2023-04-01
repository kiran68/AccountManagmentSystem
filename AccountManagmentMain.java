package com.bridgelabz.accountmanagmentsysyem;

public class AccountManagmentMain extends Account {

	public static void main(String[] args) {

		System.out.println("Welcome To Address Book Managment System");
		
		AccountManagment accountmanagment = new AccountManagment();
		accountmanagment.addAccountDetails();
		accountmanagment.displayAccountDetails();
	}

}
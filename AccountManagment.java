package com.bridgelabz.accountmanagmentsysyem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountManagment extends Account {

	List<Account> Account = new ArrayList<Account>();
	Account account = new Account();
	Scanner sc = new Scanner(System.in);

	public void addAccountDetails() {

		System.out.println("Enter Account Number : ");
		int accountNumber = sc.nextInt();
		account.setAccountNumber(accountNumber);

		System.out.println("Enter Phone Number: ");
		int accountHolderMobileNumber = sc.nextInt();
		account.setAccountHolderMobileNumber(accountHolderMobileNumber);

		System.out.println("Enter Account Holder Name :");
		String accountHolderName = sc.nextLine();
		account.setAccountHolderName(accountHolderName);

		System.out.println("Enter Account Holder Date Of Birth:");
		String accountHolderDob = sc.nextLine();
		account.setAccountHolderDob(accountHolderDob);

		System.out.println("Enter Account Holder Eamil : ");
		String accountHolderEmail = sc.nextLine();
		account.setAccountHolderEmail(accountHolderEmail);

		Account.add(account);
		System.out.println(" Add All Details");
	}

	public void displayAccountDetails() {
		if (Account.isEmpty()) {
			System.out.println("Account Dettails is Empty");
		}
		for (Account account : Account) {
			System.out.println(account.getAccountNumber());
			System.out.println(account.getAccountHolderMobileNumber());
			System.out.println(account.getAccountHolderName());
			System.out.println(account.getAccountHolderEmail());
			System.out.println(account.getAccountHolderDob());
		}
	}
}

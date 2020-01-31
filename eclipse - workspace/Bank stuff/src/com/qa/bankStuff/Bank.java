package com.qa.bankStuff;

public class Bank {

	public static void main(String[] args) {
		BankAccount elliott = new BankAccount();
		elliott.setBalance (100000.00);
		System.out.println(elliott.getBalance());
		System.out.println(elliott.toString());
	}
	
}

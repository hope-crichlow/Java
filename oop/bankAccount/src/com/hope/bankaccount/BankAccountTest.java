package com.hope.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {

		BankAccount b = new BankAccount();

		
//		TEST CASES
		
//		System.out.println("----- Checking Balance Test -----");
//		
//		System.out.println("Checking Balance: $" + b.getCheckingBalance());
//		
//		System.out.println("----- Savings Balance Test -----");
//		
//		System.out.println("Savings Balance: $" + b.getSavingsBalance());
//		
//		System.out.println("----- Total Balance Test -----");
//		
//		System.out.println("Total Balance: $" + b.getTotalBalance());
		
		
		System.out.println("----- Deposit Test -----");
		
		System.out.println("Cash Total: $" + b.cashTotal);
		
		b.deposit("savings", 500 );
		System.out.println("New Savings Balance: $" + b.getSavingsBalance());
		
		b.deposit("checking", 400 );
		System.out.println("New Checking Balance: $" + b.getCheckingBalance());
		
		System.out.println("New Cash Total: $" + b.cashTotal);
		

		
//		System.out.println("----- Test -----");
//		System.out.println("Balance: $" + b.);
//		System.out.println("----- Test -----");
//		System.out.println("----- Test -----");
//		System.out.println("----- Test -----");
		
		

	}

}

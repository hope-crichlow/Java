package com.hope.bankaccount;

public class BankAccount {

//	MEMBER VARIABLES
	
//	Attribute: (double) checking balance
	private double checkingBalance;
//	Attribute: (double) savings balance.
	private double savingsBalance;
//	Class Member: (static) that has the number of accounts created thus far.
	public static int numberOfAccounts = 0;
//	Class Member: (static) that tracks the total amount of money stored in every account created.
	public static int cashTotal = 0;

//	CONSTRUCTOR METHODS
	
//	Empty constructor setting default attributes
	public BankAccount() {
		this.checkingBalance = 0;
		this.savingsBalance = 0;
//		Increment the account count.
		numberOfAccounts ++;
	}
	
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
//	Increment the account count.
		numberOfAccounts ++;
	}
		
//	GETTERS AND SETTERS
//	Users should not be able to set any of the attributes from the class.

//	Getter Method: User's checking account balance.
	public double getCheckingBalance() {
		return this.checkingBalance;
	}
//	Getter Method: User's saving account balance.
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
//	Getter Method: User's total money from the checking and saving.
	public double getTotalBalance() {
		return this.checkingBalance + this.savingsBalance;
	}
	
	
	
//	OTHER METHODS
//	Method: Deposit money into either the checking or saving, be sure to add to total amount stored.
	public void deposit(String accountType, double depositAmount) {
		
		String account = accountType.toLowerCase();
		
		if(account.equals("savings")) {
			this.savingsBalance += depositAmount;
			
			cashTotal += depositAmount;	
			
		}else if(account.equals("checking")) {
			this.checkingBalance += depositAmount;
			
			cashTotal += depositAmount;	
		}
	}
	
//	Method: Withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
	public void withdraw(String accountType, double withdrawlAmount) {
		String account = accountType.toLowerCase();
		
		if(account.equals("savings")) {
			
			if(this.savingsBalance >= withdrawlAmount) {
				
				this.savingsBalance -= withdrawlAmount;
				cashTotal -= withdrawlAmount;
				
			} else {
				System.out.println("Insufficient Funds");
			}
				
		} else if(account.equals("checking")){
			
			if(this.checkingBalance >= withdrawlAmount) {
				
				this.checkingBalance -= withdrawlAmount;
				cashTotal -= withdrawlAmount;
				
			} else {
				System.out.println("Insufficient Funds");
			}
		}
		
	}

}

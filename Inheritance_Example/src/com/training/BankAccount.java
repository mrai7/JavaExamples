package com.training;

public class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount() {
		super();
	
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankAccount(int accountNumber, String accountHolderName,
			double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	
	public double deposit(double depAmount)
	{
		
		balance=balance+depAmount;
		
		return balance;
		
	}
	
	public double withdraw(double amount)
	{
		balance = balance -amount;
		 return balance;
	}
	
	
}

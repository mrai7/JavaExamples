package com.training;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bankObj = new BankAccount();
		
		 bankObj.deposit(4500);
		 
		 System.out.println("Balance :=>"+ bankObj.getBalance());
		 
		 bankObj.withdraw(5000);
		 
		 System.out.println("Balance :=>"+ bankObj.getBalance());
	}

}

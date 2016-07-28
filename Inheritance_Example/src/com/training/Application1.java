package com.training;

public class Application1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		SavingAccount sbAcc = new SavingAccount();
		
		sbAcc.deposit(4500);
		
			System.out.println("Balance "+ sbAcc.getBalance());
		
		sbAcc.withdraw(1000);
		
			System.out.println("Balance "+ sbAcc.getBalance());
		
		sbAcc.withdraw(3000);
		
			System.out.println("Balance "+ sbAcc.getBalance());
			
			
			SavingAccount sb2 = new SavingAccount(101,"Ramesh", 4500,"Rakesh");
			
			System.out.println(sb2.getAccountNumber());
			System.out.println(sb2.getAccountHolderName());
			System.out.println(sb2.getBalance());
			System.out.println(sb2.getNomineeName());
			
			
			
			

	}

}

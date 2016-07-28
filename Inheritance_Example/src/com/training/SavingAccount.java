package com.training;

public class SavingAccount extends BankAccount {
	
	private String nomineeName;

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public SavingAccount() {
		super();
		
	}

	public SavingAccount(int accountNumber, String accountHolderName,
			double balance,String nomineeName) {
		super(accountNumber, accountHolderName, balance);
		this.nomineeName=nomineeName;
	}

	@Override
	public  double withdraw(double amount) {
		
	
	  if((getBalance()-amount)>1000)
	  {
	     setBalance(getBalance()-amount);	  
	  }
	  else
	  {
		  System.out.println("Withdraw Limit Exceeds");
	  }
	  return getBalance();
	}
	
	

}

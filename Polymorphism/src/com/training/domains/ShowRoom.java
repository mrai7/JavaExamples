package com.training.domains;

import com.training.ifaces.IAutomobile;

public class ShowRoom {
	
	public  IAutomobile getProduct(int ch)
	{
		IAutomobile auto=null;
		
		switch (ch) {
		case 1:
			auto=new MarutiCar();
			break;
		case 2:
			auto=new ToyotaCar();
			break;
		case 3:
			auto=new HyundaiCar();
			break;
		}
		return auto;
		
	}
	/**
	 * This Method shows the working of Dynamic Dispatch 
	 * also called Run Time Polymorphism
	 * Is prints the details of the reference Object
	 * 
	 * @param polyAuto
	 */
	
	public void printQuote(IAutomobile polyAuto)
	{
		System.out.println(IAutomobile.showroomname);
		
		System.out.println("Model :="+polyAuto.getModel());
		
		System.out.println("Color :="+polyAuto.getColor());
		
		System.out.println("Price :="+polyAuto.getPrice());
	}

	
}

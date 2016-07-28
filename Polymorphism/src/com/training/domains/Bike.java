package com.training.domains;

import com.training.ifaces.IAutomobile;

public class Bike implements IAutomobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200000.00D;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Brown";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "HarlyDavidson";
	}

}

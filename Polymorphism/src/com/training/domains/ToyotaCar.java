package com.training.domains;

import com.training.ifaces.IAutomobile;

public class ToyotaCar implements IAutomobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 110000.00D;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Silky Silver";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "INNOVA";
	}

}

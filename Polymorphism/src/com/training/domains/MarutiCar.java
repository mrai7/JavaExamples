package com.training.domains;

import com.training.ifaces.IAutomobile;

public class MarutiCar implements IAutomobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100000.00D;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Swifi-Dzire";
	}

}

package com.training.domains;

import com.training.ifaces.IAutomobile;

public class HyundaiCar implements IAutomobile {

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 900000.00D;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Hyundai";
	}

}

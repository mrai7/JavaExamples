package com.training;
/**  Sub Class  for Cab Reservation.
 * 
 * @author Srivatsan
 *
 */
public class CabReservation extends AbstractReservation {

	private String cabModel;
	private double startKilometer;
	private double endKilometer;
	private double totalKilometer;


	

	public CabReservation(String customerName, long phoneNumber, String cabModel, double startKilometer,
			double endKilometer) {
		super(customerName, phoneNumber);
		this.cabModel = cabModel;
		this.startKilometer = startKilometer;
		this.endKilometer = endKilometer;
	}


	public String getCabModel() {
		return cabModel;
	}


	public void setCabModel(String cabModel) {
		this.cabModel = cabModel;
	}


	@Override
	public double calculateAmount() {
		
		totalKilometer= endKilometer-startKilometer;
	    double amount =0.0;
		if(cabModel.equals("indica"))
		{
			amount = totalKilometer * 18.00;
		}
		else
		{
		  amount = totalKilometer * 12.00;
		}
		
		return amount;
	}


	

	public double getStartKilometer() {
		return startKilometer;
	}


	public void setStartKilometer(double startKilometer) {
		this.startKilometer = startKilometer;
	}


	public double getEndKilometer() {
		return endKilometer;
	}


	public void setEndKilometer(double endKilometer) {
		this.endKilometer = endKilometer;
	}

}

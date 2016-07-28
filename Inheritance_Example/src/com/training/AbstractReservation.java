package com.training;

/** This is an Example for  Abstract Class.
 * 
 * @author Srivatsan
 *
 */
public abstract class AbstractReservation {

	private String customerName;
	private long phoneNumber;
	
	/** Method Returns Customer Name.
	 * 
	 * @return
	 */
	
  public String getCustomerName() {
		return customerName;
	}
/**
 * 
 * @return
 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
/** Parameter Constructor.
 * 
 * @param customerName
 * @param phoneNumber
 */
public  AbstractReservation(String customerName, long phoneNumber) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}

/** Method Calculates Amount.
 * 
 * @return the Calculated Amount
 */
  public abstract double calculateAmount();

  /** Example of Abstract Class Having Concrete Message.
 *   Method Prints a Greeting Message
*/
  public void sayHello() {
    System.out.println("Hi");
  }

}

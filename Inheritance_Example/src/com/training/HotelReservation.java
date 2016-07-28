package com.training;
/** Sub Class for Hotel Reservation.
 * 
 * @author Srivatsan
 *
 */

public class HotelReservation extends AbstractReservation {

  public enum HotelType {TWOSTAR,THREESTAR,FOURSTAR,FIVESTAR};

  private String roomType;
  private  HotelType type;
  private  int days;

  /** Parameter Constructor.
   * 
   * @param customerName
   * @param phoneNumber
   * @param roomType
   * @param type
   * @param days
   */
  public HotelReservation(String customerName, long phoneNumber, String roomType, HotelType type,
    int days) {
   super(customerName, phoneNumber);
    this.roomType = roomType;
    this.type = type;
    this.days = days;
  }


  @Override
  public double calculateAmount() {
    double amount = 0.0;
    switch (type) {
      case TWOSTAR:
        if (roomType.equals("AC")) {
          amount = 1200.00 * days;
          }  else  {
          amount = 900.00 * days;
        }
        break;

     default:
	amount = 2400.00 * days;
		}

		return amount;
	}

}

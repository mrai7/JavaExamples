package com.training;
import java.util.*;

import com.training.HotelReservation.HotelType;

public class Application2 {
	
	public static void calculate(AbstractReservation res)
	{
		System.out.println(res.calculateAmount());
	}
	public static void main(String[] args) {
		
		System.out.println("1 - Hotel Reservation ");
		System.out.println("2 - Cab  Reservation ");
		System.out.println("3 - Exit ");
		
		int option =0;
		AbstractReservation  resObj=null;
		do
		{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice 1-3");
			
		
			
			int key=sc.nextInt();
			
			switch (key) {
			case 1:
				 resObj = new HotelReservation("Ramesh",89848448,"Single",HotelType.TWOSTAR,2);
				 break;
			case 2:
				resObj = new CabReservation("Ganesh",9884848,"Indica",900.00d,1200.00d);
				break;
			default:
				System.out.println("invalid Choice ");
				  resObj=null;
					break;
			}
			
				if(resObj!=null)
				{
					calculate(resObj);
			
				}
				else
				{
					option=4;
				}
		}
		while(option <=2);

		
		
		
		
	}

}

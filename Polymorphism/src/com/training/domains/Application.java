package com.training.domains;

import java.util.*;

import com.training.ifaces.IAutomobile;;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[1]);
		ShowRoom showRoom=new NewShowRoom();
		
		System.out.println("Enter Your Choice 1-4");
		
		Scanner sc=new Scanner(System.in);
		
		int ch=sc.nextInt();
		
		IAutomobile polyAuto=showRoom.getProduct(ch);
		
		if(polyAuto!=null)
		{
			showRoom.printQuote(polyAuto);
		}
		else
		{
			System.out.println("Invalid Option Try Again");
		}
		//showRoom.printQuote(polyAuto);
		
		sc.close();

	}

}

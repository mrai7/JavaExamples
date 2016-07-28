package com.training.apps;

import com.training.domains.Book;
import com.training.exceptions.RangeCheckException;

//import com.training.domains.Book;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Book bk=new Book(101,"Head First Java","Kathy Sierra",4500.00);

			Book bk2=new Book(102,"Thinking in Java","Bruce Erikel",560.00);
			
			Book bk3=new Book(102,"Thinking in Java","Bruce Erikel",560.00);
			
			System.out.println(bk2.equals(bk3));
			
			System.out.println("Book 2 :="+bk2.hashCode());
			
			System.out.println("Book 3:="+bk3.hashCode());
			
			String s=new String("hari");
			
			System.out.println("Comparing Objects of Different Classes "+s.equals(bk2));
			
			Book bk4=null;
			
			System.out.println("Comparing Null Object"+bk3.equals(bk4));
			
			Book bk5=bk;
			
			System.out.println("Checking Identity :="+bk5.equals(bk));
		} catch (RangeCheckException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
		
	}

}

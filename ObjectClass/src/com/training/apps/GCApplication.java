package com.training.apps;
import com.training.domains.*;
import com.training.exceptions.RangeCheckException;
public class GCApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Book bk=new Book(101,"A","B",20.00);
			System.out.println(bk);
			System.out.println(bk.hashCode());
			
			bk=new Book(102,"A","B",20.00);
			bk=null;
			
			System.gc();
			
			System.out.println("Look at The Console For a Special Message");
			
			System.out.println("Bye...");
			
			System.out.println(bk);
			//System.out.println(bk.hashCode());
			
			
		}
		catch(RangeCheckException e) {
			System.out.println(e.getMessage());
			
		}

	}

}

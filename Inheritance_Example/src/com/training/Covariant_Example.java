package com.training;

 class Base{ 
	 
	 int passMark=60;
	 
	 public Number getNumber()
	 {
		 return 100;
	 }
	 
	 
 }


 class Sub extends Base {

	 int passMark=75;
	 
	@Override
	public Integer getNumber() {
		
		Integer num =(Integer) super.getNumber();
		
		 return num+super.passMark;
		
		
	}
	 
	 
	 
 }
 
 
public class Covariant_Example {

	
	
	public static void main(String[] args) {

		
		Base b1 = new Sub();
		
			System.out.println(b1.getNumber());

		Base b2 = new  Base();
		
			System.out.println(b2.getNumber());
	
			Sub b3 = new Sub();
			
			System.out.println("b1.passMark"+b1.passMark);
			
			System.out.println("b2.passMark"+b2.passMark);
			
			System.out.println("b3.passMark"+b3.passMark);
	}

}

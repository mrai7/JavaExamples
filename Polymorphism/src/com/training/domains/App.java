package com.training.domains;

public class App {
	 @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		App other = (App) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	int a,b;

	public static void main(String[] args) {
		String s=new String("Hello");
		String s1="Hello1";
		System.out.println(s1.equals(s));
		
		

	}

}

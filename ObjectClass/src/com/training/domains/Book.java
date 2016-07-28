package com.training.domains;
import java.util.*;

import com.training.exceptions.RangeCheckException;
public class Book {
	private long bookNumber;
	private String bookName;
	private String author;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(long bookNumber, String bookName, String author, double price) throws RangeCheckException {
		super();
		System.out.println("Book Initialised");
		if(bookNumber<1000 || bookNumber>10000)
		{
			throw new RangeCheckException(bookNumber);
		}
		
			
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public long getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(long bookNumber) {
		
		if(bookNumber<1000 || bookNumber>10000)
		{
			try {
				throw new RangeCheckException(bookNumber);
			} catch (RangeCheckException e) {
				// TODO: handle exception
				
				System.err.println(e.getMessage());
			}
		}
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ "]";
		
		
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(bookNumber,bookName,price);
	}

	public boolean equals(Object obj) {
				// TODO Auto-generated method stub
				if(this == obj)
					return true;
				if(obj == null)
					return false;
				if(this.getClass()!=obj.getClass())
					return false;
				Book bk = (Book)obj;
				
				return bk.bookNumber==this.bookNumber && bk.bookName.equals(this.bookName)&& bk.author.equals(this.author)&&bk.price == this.price;
			}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(this +";=Object Garbage Collected");
		super.finalize();
	}
	

	
	

}

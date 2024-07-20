package com.abstraction;

public class Abstract1  extends Abstract{
@Override
public void homeloan() {
	System.out.println("10%");
}
@Override
	public void educationloan() {
		
		super.educationloan();
	}
public static void main(String[] args) {
	Abstract1 l=new Abstract1();
	l.educationloan();
	l.homeloan();
}
}

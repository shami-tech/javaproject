package com.abstraction;

public class Interf1 implements Interf ,Interf2{
@Override
public void carloan() {
	System.out.println("12%");
}

@Override
public void personalLoan() {
	System.out.println("14%");
}
public static void main(String[] args) {
	Interf1 i=new Interf1();
	i.personalLoan();
	i.carloan();
}
@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("bankloan");
	}
}

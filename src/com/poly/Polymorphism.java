package com.poly;

public class Polymorphism {

	public void student() {
		System.out.println("details");	
		}
	public void student(int a) {
		System.out.println(a);	
}
	public void student(String  s) {
	System.out.println(s);	
	}
	
	public void student(int marks,String subject ) {
		System.out.println("Your Mark is " + marks +"\n"+"and subject is"+" " +subject );	
		
		}
	public void student(String name,int rollno ) {
			System.out.println("Your name is " + name +"\n"+"and rollno is"+" "+rollno );
	}
			
	
	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.student(10);
		p.student("SECTION G");
		p.student(98, "science");
		p.student("shami", 1123);
	}
	
	
	
	
	}

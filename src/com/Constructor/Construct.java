package com.Constructor;

public class Construct {
	
public Construct() {
	this(10);
	System.out.println("heloo");
}

public Construct(int a) {
	this("java");
	System.out.println(a);

}

public Construct(String s) {
	System.out.println(s);

}
public static void main(String[] args) {
	Construct c= new Construct();
}

}

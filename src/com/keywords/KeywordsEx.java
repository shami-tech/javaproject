package com.keywords;

public class KeywordsEx {
	int x=100;
	public static void staticMethod() {
		System.out.println("static");
	}
	public final void finalMethod() {
		System.out.println("final");
	}
	private void variable() {
		System.out.println(this.x);
		this.finalMethod();
		 final int e=95;
		
		System.out.println(e);
	}
	private  int  returnMethod() {
		int f=12;
		return f;
		
	}private  int  returnMethod1() {
		int d=12;
		return d;
}
	private  int  returnMethod2() {
		int f=2;
		return f;
}
	private int mtd1() {
		int y=20;
		return y;
	}
	private int mtd2() {
		int i=30;
		return i ;
	}
	
public static void main(String[] args) {
	KeywordsEx k=new KeywordsEx ();
	//k.finalMethod();
	//k.returnMethod();
	k.variable();
	System.out.println();
	//k.returnMethod1();
	//k.returnMethod2();
	System.out.println(k.returnMethod1()+k.returnMethod2());
    System.out.println(k.mtd1()+k.mtd2());
}


}

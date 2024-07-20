package com.String;

public class Stringmethod {
public static void main(String[] args) {
	String s="java By James Gosling";
	System.out.println(s);	
	int count=s.length();
	System.out.println(count);
	
	boolean equals=s.equals("selenium by jason huggins");
	System.out.println(equals);
	
	boolean equalsIgnoreCase= s.equalsIgnoreCase("selenium by jason huggins");
	System.out.println(equalsIgnoreCase);
	
String UpperCase=s.toUpperCase();
System.out.println(UpperCase);

	String lowerCase=s.toLowerCase();
System.out.println(lowerCase);
	
	boolean startsWith=s.startsWith("sele");
	System.out.println(startsWith);
	
	
	boolean endsWith=s.endsWith("huggins");
	System.out.println(endsWith);
	
	boolean contains=s.contains("Selenium");
	System.out.println(contains);	
int indexof=s.indexOf("e");
	System.out.println(indexof);
	
	int lastindexof=s.lastIndexOf("e");
	System.out.println(lastindexof);
		char charAt=s.charAt(0);
	System.out.println(charAt);
	
	String replace=s.replace("java", "selenium");
	System.out.println(replace);
	
	String substring=s.substring(2);
	System.out.println(substring);
	
	boolean empty=s.isEmpty();
	System.out.println(empty);
	
	String[]words=s.split(" ");
	for(String word:words) {
		System.out.println(word);
		
		String trim=s.trim();
		System.out.println(trim);
		
		String concat=s.concat("selenium");
		System.out.println(concat);
		
		
		
	}
	
	
	
	
	
}

}

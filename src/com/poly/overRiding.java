package com.poly;

public class overRiding extends Polymorphism{
@Override
public void student() {
	
	super.student();
}
	@Override
		public void student(int a) {
			
			super.student(a);
		}@Override
			public void student(String s) {
				
				super.student(s);
			}
	@Override
		public void student(int marks, String subject) {
			
			super.student(marks, subject);

}
		@Override
			public void student(String name, int rollno) {
				
				super.student(name, rollno);
			}
		public static void main(String[] args) {
			overRiding o=new overRiding();
			o.student();
			o.student(20);
			o.student("shamina");
			o.student(76, "science");
			o.student("john", 1124);
		}
		
		
		
		
}
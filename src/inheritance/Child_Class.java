package inheritance;

public class Child_Class extends Parent_Class {

	private void salary() {
		System.out.println("15000");
	}
	public static void main(String[] args) {
		Child_Class s=new Child_Class();
		s.salary();
		s.company();
		s.employee();
	}
}

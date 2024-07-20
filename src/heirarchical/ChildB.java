package heirarchical;

public class ChildB extends Parent{
	private void name2() {
		System.out.println("Abdul");
		}
	private void age2() {
		System.out.println("08");
	}
	public static void main(String[] args) {
		ChildB p=new ChildB();
		p.age2();
		p.name2();
		p.name();
	}	
}

package heirarchical;

public class ChildA extends Parent{
private void name1() {
	System.out.println("Afiya");
	}
private void age1() {
	System.out.println("10");
}
public static void main(String[] args) {
	ChildA p=new ChildA();
	p.age1();
	p.name1();
	p.name();
}
}

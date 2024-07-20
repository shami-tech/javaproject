package multilevel_inheritance;

public class Child extends Parent{
private void land2() {
	System.out.println("1");
}
public static void main(String[] args) {
	Child g=new Child();
	g.land();
	g.land2();
	g.name();
	g.land1();
}
}

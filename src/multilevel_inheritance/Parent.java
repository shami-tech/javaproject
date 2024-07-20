package multilevel_inheritance;

public class Parent extends Grandparent{
public void land1() {
	System.out.println("2");
}
public static void main(String[] args) {
	

Parent g=new Parent();
g.land1();
g.land();
g.name();
}
}
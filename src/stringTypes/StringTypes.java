package stringTypes;

public class StringTypes {
	public static void main(String[] args) {
		
	
	String s="java";//immutable
String s2="java";
System.out.println(s);

System.out.println(s2);
System.out.println(System.identityHashCode(s));
System.out.println(System.identityHashCode(s2));
String s3 = s.concat(s2);//concadination used here
System.out.println(s3);
System.out.println(System.identityHashCode(s3));
		StringBuffer sb=new StringBuffer("selenium");//Mutable
		StringBuffer sb2=new StringBuffer("selenium");
		//System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        System.out.println(System.identityHashCode(sb2));
        StringBuffer sb3 = sb.append(sb2);
        System.out.println(sb3);
        System.out.println(System.identityHashCode(sb3));
        
        StringBuilder sc=new StringBuilder("welcome");//Mutable
		StringBuilder sc2=new StringBuilder("java");
		//System.out.println(sc);
        System.out.println(System.identityHashCode(sc));
        System.out.println(System.identityHashCode(sc2));
        StringBuilder sc3 = sc.append(sc2);
        System.out.println(sc3);
        System.out.println(System.identityHashCode(sc3));
        
        
		}
	
	
}

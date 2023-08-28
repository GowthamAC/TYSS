package Interview;

public class stringswaping {
public static void main(String[] args) {
	String a="apple";
	String b="banana";
	a=a+b;  //applebanana
	b=a.substring(0,(a.length()-b.length()));
	System.out.println(b);  //apple
	
	a=a.substring(b.length(), a.length());
	System.out.println(a);
}
}

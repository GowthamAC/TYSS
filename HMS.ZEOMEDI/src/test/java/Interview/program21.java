package Interview;

public class program21 {
public static void main(String[] args) {
	//output= s se sel sele selen seleni seleniu selenium
	
	String s="selenium";
	String s1="";
	char[] ch = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		s1=s1+ch[i];
		System.out.print(s1+" ");
	}
}
}

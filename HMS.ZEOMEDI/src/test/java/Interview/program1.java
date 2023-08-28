package Interview;

public class program1 {
public static void main(String[] args) {
	String s="welcome to go the bangalore";
	String[] str = s.split(" ");
	String s3="";
	String s1=str[0];
	String s2=str[str.length-1];
	for (int j = 1; j < str.length-1; j++) {
		s3=s3+str[j]+" ";
	}
	System.out.println(s2+" "+s3+" "+s1+" ");
}
}

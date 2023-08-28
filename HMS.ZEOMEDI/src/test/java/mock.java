
public class mock {
public static void main(String[] args) {
String s="appa amma anna";
String s2="";
String[] str = s.split(" ");
String s3="";
for (int i = 0; i < str.length; i++) {
	s2=str[i];
	for (int j = 0; j < s2.length(); j++) {
		if(j==0)
		{
		s3=s3+(char)(s2.charAt(j)-32);
		}
		else
		{
		s3=s3+s2.charAt(j);
	}
	}
	s3=s3+" ";
}

System.out.println(s3);
}
}
package Interview;

public class screaning2 {
public static void main(String[] args) {
String s1="abcddg @778";   //abcdg778
String s="";
for (int i = 0; i < s1.length(); i++) {
	char chr = s1.charAt(i);
	if (Character.isLetterOrDigit(chr)) {
		s=s+chr;
	}
}
char[] ch = s.toCharArray();
for (int i = 0; i < ch.length; i++) {
	for (int j = i+1; j < ch.length; j++) {
		if((ch[i]==ch[j]) && !Character.isDigit(ch[i])) {
			ch[j]=9;
		}
	}
}
System.out.println("String after removing spl char and charduplicate :");
for (int i = 0; i < ch.length; i++) {
	if (ch[i]!=9) {
		System.out.print(ch[i]);
	}
}
//To get number only 
System.out.println();
System.out.println("Only number :");
for (int i = 0; i < ch.length; i++) {
	if(Character.isDigit(ch[i]))
		System.out.print(ch[i]);
}
}
}

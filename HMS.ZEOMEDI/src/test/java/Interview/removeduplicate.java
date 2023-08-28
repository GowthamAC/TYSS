package Interview;

public class removeduplicate {
public static void main(String[] args) {
String s="gowww@thh&amm*";
StringBuilder sb = new StringBuilder(s);
 //char[] ch = sb.toCharArray();
 for (int i = 0; i < sb.length(); i++) {
	if (!Character.isLetterOrDigit(sb.charAt(i))) {
		sb.deleteCharAt(i);
		sb.deleteCharAt(i-1);
	} 
}
 System.out.println(sb);
}
}

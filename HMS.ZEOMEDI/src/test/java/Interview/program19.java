package Interview;

public class program19 {
public static void main(String[] args) {
	String s="aabcbbdeaa";    //aa ab bc cb bb bd de ea aa
	char[] ch = s.toCharArray();
	
	for (int i = 1; i < ch.length; i++) {
		System.out.print(ch[i-1]+""+ch[i]+" ");
	}
	
}
}
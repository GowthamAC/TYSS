package Interview;

import java.util.LinkedHashSet;

public class program12 {
public static void main(String[] args) {
	//print accurence of word
	String s="malayalam";
	char[] ch = s.toCharArray();
	LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
	for (int i = 0; i < ch.length; i++) {
		lhs.add(ch[i]);
	}
	for (Character chr : lhs) {
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			if (chr==ch[i]) {
				count++;
			}
		}
		System.out.print(chr+""+count+" ");
	}
}
}

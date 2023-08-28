package Interview;

import java.util.LinkedHashSet;

public class program2 {
public static void main(String[] args) {
	String s="tester";
	char[] ch = s.toCharArray();
	LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
	for (int i = 0; i < ch.length; i++) {
		lhs.add(ch[i]);
	}
	//System.out.println(lhs);
	for (Character chr : lhs) {
		System.out.print(chr);
	}
}
}

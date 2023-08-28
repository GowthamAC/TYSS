package Interview;

import java.util.LinkedHashSet;

public class program6 {
public static void main(String[] args) {
	//input: aaabbcdddf     output: a3b2cd3f
	String s="aaabbcdddf";
	char[] ch = s.toCharArray();
	LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
	for (int i = 0; i < ch.length; i++) {
		lhs.add(ch[i]);
	}
	System.out.println(lhs);
	
for (Character chr : lhs) {
	int count=0;
	for (int i = 0; i < ch.length; i++) {
		if(chr==ch[i]) {
			count++;
		}
	}
	if (count>1) {
	System.out.print(chr+""+count+"");
}else {
	System.out.print(chr);
}
	}
}
}


package StringProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s="Tester";
		String str = s.toLowerCase();
       LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
       for (int i = 0; i < str.length(); i++) {
		lhs.add(str.charAt(i));
	}
       System.out.println(lhs);
       
      // to get in linebyline 
       for (Character ch : lhs) {
		System.out.println(ch);
	}
	}

}

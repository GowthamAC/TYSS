package StringProgram;

import java.util.LinkedHashSet;

public class IndexofDuplicateChar {

	public static void main(String[] args) {
		String s="tester";
		String str = s.toLowerCase();
       LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
       for (int i = 0; i < str.length(); i++) {
		lhs.add(str.charAt(i));
	    }
       System.out.println(lhs); //To print Hashset
 
        for (Character ch : lhs) {
		for (int i = 0; i < str.length(); i++) {
			if (ch==str.charAt(i)) {
			System.out.println(str.charAt(i)+" present in "+(i+1)+" position");
			break;
		}
		}
	}
	}
}

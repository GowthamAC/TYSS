package StringProgram;

import java.util.LinkedHashSet;

public class IndexCountOfChar {

	public static void main(String[] args) {
		String s="Testert";
		String str = s.toLowerCase();
       LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
       for (int i = 0; i < str.length(); i++) {
		lhs.add(str.charAt(i));
	    }
       System.out.println(lhs); //To print Hashset
    //To compare with s
        for (Character ch : lhs) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (ch==str.charAt(i)) 
				count++;
		}
       System.out.println(ch+" = "+count);
        if (count>1) {
   	   System.out.println(ch+" is repeating "+count+" times");
        }	
		}
	}
}

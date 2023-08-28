package Interview;

import java.util.ArrayList;
import java.util.Collections;

public class screaning4 {
public static void main(String[] args) {
	//anagram programs
	String s="act";
	String s1="cat";
	ArrayList al=new ArrayList();
	ArrayList al1=new ArrayList();
	//store in arrays
	for (int i = 0; i < s.length(); i++) {
		al.add(s.charAt(i));
	}
	for (int i = 0; i < s1.length(); i++) {
		al1.add(s1.charAt(i));
	}
	//sort arrays and compare
	Collections.sort(al);
    Collections.sort(al1);

	if (al.equals(al1)) {
		System.out.println("S and S1 are anagram");
	} else {
        System.out.println("S and S1 are not a anagram");
	}

}
}

package Interview;

import java.util.LinkedHashSet;

public class program15 {
public static void main(String[] args) {
	//print which are not duplicate
	String s="aweexxxyyyyyy"; 
	LinkedHashSet<Character> patil = new LinkedHashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		patil.add(ch);
	}
	for (Character chr : patil) {
		int count=0;
		for (int i = 0; i <s.length(); i++) {
			if (chr==s.charAt(i)) {
				count++;
			}
		}
		if (count==1) {
			System.out.print(chr+" ");
		}
	}
}
}

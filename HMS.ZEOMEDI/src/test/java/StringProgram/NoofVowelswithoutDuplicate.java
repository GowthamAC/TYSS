package StringProgram;

import java.util.LinkedHashSet;

public class NoofVowelswithoutDuplicate {

	public static void main(String[] args) {
		String s="bangalore";  //3
		int count =0;
		LinkedHashSet<Character> chr=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			chr.add(s.charAt(i));
		}
		for (Character ch : chr) {
		if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			count++;
			System.out.println(ch+" is a vowel");
		}
	    }
      System.out.println("No of vowels without Duplicate is "+count);
	}
}

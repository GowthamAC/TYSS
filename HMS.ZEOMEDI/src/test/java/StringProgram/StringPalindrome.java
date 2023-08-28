package StringProgram;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String s = sc.nextLine();
		String s1=""; 
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			s1=ch+s1;
		}
		System.out.println(s1);
		if (s1.equals(s)) {
			System.out.println("It is a palindrome");
		} else {
            System.out.println("It is not a palindrome");
		}
	}
}

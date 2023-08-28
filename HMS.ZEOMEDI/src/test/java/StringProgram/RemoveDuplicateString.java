package StringProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {
	String s="string has duplicate string";
	String[] string = s.split(" ");
	LinkedHashSet<String> str=new LinkedHashSet<String>();
    for (int i = 0; i < string.length; i++) {
        str.add(string[i]);
		}
    System.out.println(str);
	}
	}


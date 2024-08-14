package StringProgram;

import java.util.LinkedHashSet;

public class IndexOfDuplicateString {

	public static void main(String[] args) {
		String s="string has duplicate has string";
		String[] string = s.split(" ");
		LinkedHashSet<String> str=new LinkedHashSet<String>();
	    for (int i = 0; i < string.length; i++) {
		str.add(string[i]);
	}
    	 for (String string2 : str) {
			for (int i = 0; i < string.length; i++) {
				if (string2==string[i]) {
					System.out.println(string[i]+" present in "+(i+1)+" position");
				}
			}
		}
	}	
	}
package Interview;

import java.util.LinkedHashSet;

public class program3 {
	public static void main(String[] args) {

    String s="my name is gowtham gowtham";
    String[] str = s.split(" ");
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    for (int i = 0; i < str.length; i++) {
		lhs.add(str[i]);
	}
   // System.out.println(lhs);
    for (String str1 : lhs) {
		System.out.print(str1+" ");
	}
	}
}

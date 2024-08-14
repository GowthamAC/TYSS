package interview2;

import java.util.Arrays;

public class vowels1 {
public static void main(String[] args) {
	String s="gowthamac";//gwthmcoaa
	char [] ch=s.toCharArray();
	int m=0;
	int n=ch.length-1;
	String vowels="aeiou";
	for (int i = 0; i <ch.length; i++) {
		if(vowels.contains(ch[i]+"")) {
			ch[n]=ch[i];
			n--;
		}else {
			ch[m]=ch[i];
			m++;
		}
	}
	System.out.println(Arrays.toString(ch));
}
}

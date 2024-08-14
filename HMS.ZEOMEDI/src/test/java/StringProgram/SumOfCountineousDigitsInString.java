package StringProgram;

import java.util.ArrayList;

public class SumOfCountineousDigitsInString {

	public static void main(String[] args) {
	String s="a11b12c3a";
	char [] ch = s.toCharArray();
	ArrayList<Integer> al = new ArrayList();
	int sum=0;
	int tsum=0;
	for(int i=0; i<ch.length; i++) {

		int a = ch[i]-48;
		if(a>0 && a<=9) {
			sum=sum*10 + a;
		}else {
			al.add(sum);
			sum=0;
		}
	}
	System.out.println(al);
	for(int b:al) {
		tsum=tsum+b;
	}
	System.out.println(tsum);
	
	}

	}

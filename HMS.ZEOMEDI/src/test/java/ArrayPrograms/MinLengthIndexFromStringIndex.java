package ArrayPrograms;

public class MinLengthIndexFromStringIndex {

	public static void main(String[] args) {
	String []s= {"ab","abc","abcd","cd"};  //o/p==ab cd
    String small=s[0];
    for (int i = 0; i < s.length; i++) {
	    if (s[i].length()<small.length()) {
		  small=s[i];
	    }
		}
    for (int i = 0; i < s.length; i++) {
		if (s[i].length()==small.length()) {
	     System.out.println(s[i]+" present in "+(i+1)+" position");
		}
	}
	}
	}


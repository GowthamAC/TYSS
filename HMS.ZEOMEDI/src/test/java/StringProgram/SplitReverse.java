package StringProgram;

public class SplitReverse {

	public static void main(String[] args) {
	String s="I Am A Software Engineer";
	String[] string = s.split(" ");
	String s1="";
    for (int i = 0 ; i <string.length; i++) {
		s1=string[i]+" "+s1;
	}
    System.out.println(s1);
	}
}

package StringProgram;

public class RemoveSpaces {

	public static void main(String[] args) {
	String s="I Am A Software Engineer";
	System.out.println(s.replaceAll(" ", ""));
	
	//2nd Method
	
	String[] string = s.split(" ");
	String s1="";
	for (int i = 0; i < string.length; i++) {
		s1=s1+string[i];
	}
	System.out.println(s1);
	}
}

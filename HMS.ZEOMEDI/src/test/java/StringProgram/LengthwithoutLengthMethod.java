package StringProgram;

public class LengthwithoutLengthMethod {

	public static void main(String[] args) {
		String s="gowtham";
		char[] ch = s.toCharArray();
		int count=0;
        for (char c : ch) {
			count++;
        }
        System.out.println("Length/Size of a string is "+count);
	} 
}
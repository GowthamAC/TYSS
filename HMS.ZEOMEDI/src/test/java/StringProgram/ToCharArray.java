package StringProgram;

public class ToCharArray {

	public static void main(String[] args) {
		String s="gowtham";
		char ch[]=s.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			System.out.print(ch[i]);
		}
	}
}
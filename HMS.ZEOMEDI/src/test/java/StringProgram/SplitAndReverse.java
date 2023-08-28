package StringProgram;

public class SplitAndReverse {

	public static void main(String[] args) {
		String s="Software Engineer"; //erawtfoS reenignE
		String[] string = s.split(" ");

		for (String str : string) {
			for (int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print(" ");
	}			
}
}
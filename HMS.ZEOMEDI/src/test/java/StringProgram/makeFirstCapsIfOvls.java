package StringProgram;

public class makeFirstCapsIfOvls {

	public static void main(String[] args) {
		String str="i love india";    //I love India
		String [] s = str.split(" ");
		String ovls = "aeiou";
		for(String string : s) {
			for(int i=0; i<string.length(); i++) {
				if(i==0 && ovls.contains(string.charAt(i)+"")) {
					System.out.print(Character.toUpperCase(string.charAt(i)));
				}else {
					System.out.print(string.charAt(i));
				}
			}
			System.out.print(" ");
		}
	}
}

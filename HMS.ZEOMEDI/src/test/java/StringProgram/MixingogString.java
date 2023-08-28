package StringProgram;

public class MixingogString {

	public static void main(String[] args) {
		String s="my name is gowtham";
		String[] string = s.split(" ");
		String s1 = string[0];
		String s2 = string[string.length-1];
		String s3=" ";
		for (int i = 1; i < string.length-1; i++) {
			s3=s3+string[i]+" ";
		}
		System.out.println(s2+s3+s1);

	}

}

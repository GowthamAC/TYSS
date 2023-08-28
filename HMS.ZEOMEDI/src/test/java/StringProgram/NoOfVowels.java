package StringProgram;

public class NoOfVowels {

	public static void main(String[] args) {
		String s="bAngalore";  //4
		int count =0;
      for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
			
			System.out.println(ch);
		}
	}
      //System.out.println("Vowel count in string is "+count);
	}

}

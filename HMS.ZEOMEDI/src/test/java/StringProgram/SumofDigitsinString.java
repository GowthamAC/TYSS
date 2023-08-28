package StringProgram;

public class SumofDigitsinString {

	public static void main(String[] args) {
	String s="1a2a3aa";
	int sum=0;
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (ch >='0' && ch <='9') {
			int n = ch-48; //acsi value of 0 is 48
		//asci value of 1 is 49-48 = 1
			sum=sum+n;
		}
	}
	System.out.println("Sum of Num in given string "+sum);
	}
}

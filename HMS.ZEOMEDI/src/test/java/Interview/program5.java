package Interview;

public class program5 {
public static void main(String[] args) {
	//Reverse the words in a string
	String s="my name is gowtham";
	String[] str = s.split(" ");
	for (String str1 : str) {
		for (int i =  str1.length()-1; i >=0; i--) {
			char ch = str1.charAt(i);
			System.out.print(ch);
		}
		System.out.print(" ");
	}
}
}

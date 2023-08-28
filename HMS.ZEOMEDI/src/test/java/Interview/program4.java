package Interview;

public class program4 {
//Insert a string into  middle of string array
	public static void main(String[] args) {

	String []s= {"abc","ghi","jkl"};
	String s1="def";
	int n=2;
	String[] str = new String[s.length+1];
	for (int i = 0; i < str.length; i++) {
		if(i==n) {
			str[i]=s1;
		}else if(i<n) {
			str[i]=s[i];
		}else if(i>n) {
			str[i]=s[i-1];
		}
	}
	for (int i = 0; i < str.length; i++) {
		System.out.print(str[i]+" ");
	}
	}
}

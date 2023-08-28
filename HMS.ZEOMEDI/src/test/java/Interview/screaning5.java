package Interview;

public class screaning5 {
public static void main(String[] args) {
	String[] str= {"vivek","vijay","abhishek"};  //no of vowels
for(String s:str) {
	int count=0;
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}
	}
	System.out.println(s+" "+count);
}
}
}

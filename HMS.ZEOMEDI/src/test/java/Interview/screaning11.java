package Interview;

public class screaning11 {

	public static void main(String[]args){
String s="abcdcbabea";
char[] ch = s.toCharArray();

for (int i = 0; i <ch.length; i++) {
	char count=48;
	for (int j = i+1; j < ch.length; j++) {
		if (ch[i]==ch[j] && !Character.isDigit(ch[i])) {
			count++;
			ch[j]=count;
		}
	}
}
for (char c : ch ) {
	System.out.print(c+" ");
}
} 
}

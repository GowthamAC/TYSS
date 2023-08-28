package Interview;

public class program20 {
public static void main(String[] args) {
	
	//this is tv
	String s="this is fun show";
	String s1="fun tv show";
	String[] str =s.split(" ");
	
	String[] str2 = s1.split(" ");
	String tv =str2[str2.length/2];
	
	for (int i = 0; i < str.length-2; i++) {
		System.out.print(str[i]+" ");
	}
	System.out.print(tv);
	
}
}

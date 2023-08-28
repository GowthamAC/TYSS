package Interview;

public class program9 {
public static void main(String[] args) {
	//input: i am selenium    output: m ui nelesmai
     String s="i am selenium";
     String[] str = s.split(" ");
     String s2="";
     String s3="";
     for (String s1 : str) {
    	 for (int i = 0; i < s1.length(); i++) {
			s3=s1.charAt(i)+s3;
		}
	}
     System.out.println(s3);
	}
}


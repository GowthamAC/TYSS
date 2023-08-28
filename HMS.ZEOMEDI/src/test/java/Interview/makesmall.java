package Interview;

public class makesmall {
public static void main(String[] args) {
	String s="GOWTHAMshetty234@#$";   //gowthamSHETTY234@#$
	String uc="";
	String lc="";
	String sc="";
	for (int i = 0; i <s.length(); i++) {
		char ch = s.charAt(i);
		if (Character.isUpperCase(ch)) {
			char ch1 = Character.toLowerCase(ch);
			lc=lc+ch1;
		} else if(Character.isLowerCase(ch)) {
			char ch2 = Character.toUpperCase(ch);
			uc=uc+ch2;
		}else {
			sc=sc+ch;
		}
		
	}
	System.out.println(lc+uc+sc);
}
}

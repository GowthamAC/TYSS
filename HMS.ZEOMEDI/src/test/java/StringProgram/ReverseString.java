package StringProgram;

public class ReverseString {

	public static void main(String[] args) {
		String s="gowtham";
        String s1=" ";
        for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			s1=ch+s1;
		}
        System.out.println(s1);
        
        //2nd method
        String s2 = "kantha";
    	for(int i=s2.length()-1; i>=0;i--) {
    		System.out.print(s2.charAt(i));
	}
    	System.out.println(" ");
    	
    	//3rd method
    	String s3="kowshik";
    	char[] ch = s3.toCharArray();
    	String s4="";
    	for (int i = 0; i < ch.length; i++) {
			s4=ch[i]+s4;
		}
    	System.out.println(s4);
	}
}

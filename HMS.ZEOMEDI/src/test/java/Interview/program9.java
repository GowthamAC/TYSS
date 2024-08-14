package Interview;

public class program9 {
public static void main(String[] args) {
	//input: i am selenium    output: m ui nelesmai
     String s="i am selenium";
     String str = s.replaceAll(" ", "");
     StringBuilder s1 = new StringBuilder(str);
     str=s1.reverse().toString();
     String s2="";
     int count=0;
     for(int i=0; i<s.length(); i++) {
    	 if(s.charAt(i)!=' ') {
    		 s2=s2+str.charAt(count);
    		 count++;
    	 }else {
    		 s2=s2+" ";
    	 }
     }
     
     System.out.println(s2);
	}
}


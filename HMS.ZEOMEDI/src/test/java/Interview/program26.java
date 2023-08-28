package Interview;

public class program26 {
	
public static void main(String[] args) {
   String s="abcd12efg100mn9a";   //12+100+9
   String sum="0";
   int add=0;
   for (int i = 0; i < s.length(); i++) {
	  char ch = s.charAt(i);
	   if (Character.isDigit(ch)) {
		sum=sum+ch; 
	}
	   else {
		   
		   add=add+Integer.parseInt(sum);
		   sum="0";
 }  
}
   System.out.println(add);
}
}

package Interview;

public class sunofnuminstring{
public static void main(String[] args) {
	String s="aa11bb22cc33";  //11+22+33=66
    int tsum=0; 
	int sum=0;
	
	for (int i = 0; i < s.length(); i++) {
		char ch = s.charAt(i);
		if (Character.isDigit(ch)) {
			sum=sum*10+ch-48;
		}else { 
			tsum=tsum+sum;
			sum=0;
		}
		
	}
	tsum=tsum+sum;
	System.out.println(tsum);
	 
}
}

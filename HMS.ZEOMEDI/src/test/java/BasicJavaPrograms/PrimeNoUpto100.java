package BasicJavaPrograms;

public class PrimeNoUpto100 {

	public static void main(String[] args) {
    int a=1;
    while (a<=100) {
    	 int i=2;
    	 int count=0;
    	while (i<=a/2) {
       if (a%i==0) {
		count++;
	}
       i++;
	}
    	if (count==0) {
			System.out.println(a+" is prime number");
		}
    	a++;
	}
	}
}

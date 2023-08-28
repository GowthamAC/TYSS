package BasicJavaPrograms;

public class PrimeNumInArray {
public static void main(String[] args) {
	int a[]= {3,5,6,8,9};
	int n=2;
	int count=0;
	for (int i = 0; i < a.length; i++) {
		while (n<=a[i]/2) {
			if (a[i]%n==0) {
				count++;
			}
			n++;
		}
			if (count==0) {
				System.out.println(a[i]+" is a prime number");
			}
		}
		
	}
}
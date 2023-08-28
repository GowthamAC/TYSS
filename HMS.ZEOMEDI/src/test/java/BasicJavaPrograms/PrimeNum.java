package BasicJavaPrograms;

public class PrimeNum {

	public static void main(String[] args) {
	int a=7;
	int count=0;
	int i=2;
	while (i<=a/2) {
		if (a%i==0) {
			count++;
		}
		i++;
	}
	if (count==0) {
		System.out.println(a+" is a prime number");
	} else {
        System.out.println(a+" is not a prime number");
	}

	}

}

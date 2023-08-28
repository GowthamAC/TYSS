package ArrayPrograms;

import java.util.Arrays;
public class Sumof2minNum {

	public static void main(String[] args) {
	int a[]= {2,5,7,1,10};
	int sum=0;
	Arrays.sort(a);
	for (int i = 0; i < 2; i++) {
		sum=sum+a[i];
	}
	System.out.println("Sum of first 2 smallest num is "+sum);

	}
}

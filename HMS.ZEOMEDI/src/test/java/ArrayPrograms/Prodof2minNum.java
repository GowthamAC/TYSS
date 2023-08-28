package ArrayPrograms;

import java.util.Arrays;

public class Prodof2minNum {

	public static void main(String[] args) {
	int a[]= {10,30,5,20,60};
	Arrays.sort(a);
	int prod =1;
	
    for (int i = 0; i < 2; i++) {
		prod=prod*a[i];
	}
    System.out.println("Product of 1st 2min number is "+prod);
	}
}

package Interview;

import java.util.Arrays;

public class program8 {
public static void main(String[] args) {
	//Product of Max 3 element
	int []a= {7,4,0,2,1,9};
	int prod=1;
	
	//Arrays.sort(a);
	
	int temp=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
		if (a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
	}
	
	for (int i = a.length-1; i >2; i--) {
	prod=prod*a[i];
	}
	System.out.println("Product of max of 3 num is  "+prod);
}
}

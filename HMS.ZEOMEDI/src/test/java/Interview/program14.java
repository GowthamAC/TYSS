package Interview;

import java.util.Arrays;

public class program14 {
public static void main(String[] args) {
	int []a= {9,4,2,6,8,9};
	int sum=0;
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
	for (int i = 0; i <a.length-3; i++) {
		sum=sum+a[i];
	}
	System.out.println("Sum of first 3 min num "+sum);
}
}

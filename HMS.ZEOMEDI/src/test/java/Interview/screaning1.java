package Interview;

public class screaning1 {
public static void main(String[] args) {
	int [] a= {1,2,3,4};   //3,4,1,2
	
	int n=2;
	for (int i = 0; i <n; i++) {
		int j;
		int last=a[0];
		for ( j = 0; j < a.length-1; j++) {
			a[j]=a[j+1]; 
		}
		a[j]=last;
	}
	
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
}
}

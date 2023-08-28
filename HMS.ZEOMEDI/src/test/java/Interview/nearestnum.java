package Interview;

public class nearestnum {
public static void main(String[] args) {
	int [] a= {1,2,3,4,5,6};
	int x=8;
	int near=a[0]+a[1];
	int num1 = 0,num2=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			int sum=a[i]+a[j];
			int n=0;
			if (sum>x) {
				n=sum-x;
			} else {
               n=x-sum;
			}
			if (n<near) {
				near=n;
				num1=a[i];
				num2=a[j];
			}
		}
	}
	System.out.println(num1+" "+num2+" are the nearest number for "+x);
}
}

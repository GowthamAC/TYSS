package Interview;

public class program22 {
public static void main(String[] args) {
	int [] a= {1,3,4};  //upto 10 except a array
	for (int i = 1; i <=10; i++) {
		if (i!=a[0] && i!=a[1] && i!=a[2]) {
			System.out.print(i+" ");
		}
	}
}
}
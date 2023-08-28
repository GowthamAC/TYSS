package BasicJavaPrograms;

public class FibonaciSeries {

	public static void main(String[] args) {
	int a=0;
	int b=1;
	int c=0;
	System.out.print(a+" ");
	System.out.print(b+" ");
	for (int i = 0; i <=10; i++) {    //while(c<30)
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
	}

}

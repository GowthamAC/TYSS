package BasicJavaPrograms;

public class FactorialOfNum {

	public static void main(String[] args) {
		int i=5;
		int prod=1;
		while (i>0) {
			prod=prod*i;
			i--;
		}
		System.out.println("Factorial of a give num is "+prod);
	}
}
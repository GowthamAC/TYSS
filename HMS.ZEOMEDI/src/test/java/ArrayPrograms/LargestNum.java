package ArrayPrograms;

public class LargestNum {

	public static void main(String[] args) {
	int a[]= {10,20,30,40,5};
	int lar=a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]>lar) {
			lar=a[i];
		}
	}
	System.out.println(lar);
}
}

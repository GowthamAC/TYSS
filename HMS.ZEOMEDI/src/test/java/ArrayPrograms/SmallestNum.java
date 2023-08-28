package ArrayPrograms;

public class SmallestNum {

	public static void main(String[] args) {
		int a[]= {5,10,3,20,30};
		int small=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<small) {
				small=a[i];
			}
		}
		System.out.println("Smallest element of an array is "+small);
}
}

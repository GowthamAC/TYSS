package ArrayPrograms;

public class smallest2ndNum {

	public static void main(String[] args) {
		int a[]= {1,0,3,30};
		int small=a[0];
		int small1=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<small) 
				small=a[i];
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]<small1 && a[i]!=small ) 
				small1=a[i];
		}
		System.out.println("Smallest element of an array is "+small);
		System.out.println("Second smallest Num in am array is "+small1);
}
} 
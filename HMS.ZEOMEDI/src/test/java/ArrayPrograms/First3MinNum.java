package ArrayPrograms;

public class First3MinNum {

	public static void main(String[] args) {
		int []a= {1,4,5,6,8};
		int small=a[0];
		int small1=a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<small) 
				small=a[i];
			
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]<small1 && a[i]!=small) 
				small1=a[i];
			
		}
		System.out.println("1st smallest num in array is "+small);
		System.out.println("2st smallest num in array is "+small1);
		//System.out.println("3st smallest num in array is "+small2);
	}

}

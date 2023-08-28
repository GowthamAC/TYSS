package ArrayPrograms;

public class Additionof2Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,1,3};
		int b[]= {5,6,7,8};
		int length=a.length;
		if (b.length>a.length) {
			length=b.length;
		}
		for (int i = 0; i < length; i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			} catch (Exception e) {
				if (a.length>b.length) {
					System.out.print(a[i]+" ");
				} else {
                    System.out.print(b[i]+" ");
				}
			}
		}
	}
}
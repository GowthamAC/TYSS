package ArrayPrograms;

public class CombinationOfNum {

	public static void main(String[] args) {
	int[]a= {1,4,7,8,2,9,3};  //if u add 2num u get 11
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
	    if (a[i]+a[j+1]==11) 
			System.out.println("Pair of 2Num are "+a[i]+" "+a[j+1]);
		}
	}
	}
}

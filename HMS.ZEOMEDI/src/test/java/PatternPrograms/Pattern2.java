package PatternPrograms;

public class Pattern2 {

	public static void main(String[] args) {
	int n=5;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
		if (i==1 || i==n ||j==1 || i==4&&j==2) {   
			System.out.print("* ");
		}
	}
		System.out.println();
	}
	}
}



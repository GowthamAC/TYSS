package Interview;

public class program7 {
public static void main(String[] args) {
	//input: {7, -3, 0, 2, 1, -9} find first max element without bubble sorting  
	int []a= {7, -3, 0, 2, 1, -9};
	int lar=a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]>lar) {       //to get small make it <
			lar=a[i];
		}
	}
	System.out.println(lar);
}
}

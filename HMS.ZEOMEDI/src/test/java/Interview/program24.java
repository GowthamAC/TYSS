package Interview;

public class program24 {
public static void main(String[] args) {
int a[]= {1,3,2,2,3,1,4};  //remove duplicate without using inbuilt
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if (a[i]==a[j]) {
			a[j]=10;
		}
	}
	
		}
for (int j = 0; j < a.length; j++) {
	if (a[j]!=10) {
		System.out.println(a[j]);
	}
	
}
}
}


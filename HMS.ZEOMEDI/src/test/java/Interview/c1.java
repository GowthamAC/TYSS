package Interview;

public class c1 {
public static void main(String[] args) throws InterruptedException {
    int a[]={1,3,5,7};
    int b[]={2,4,6,8,9,10};
   int [] c = new int [a.length+b.length]; // 4+4

   for (int i = 0; i < a.length; i++) {
     c[i]=a[i];
}
   for (int i = 0; i < b.length; i++) {
	c[a.length+i]=b[i];
}
   for (int i = 0; i < c.length; i++) {
	System.out.print(c[i]+" ");
}
}
}
package Interview;

public class Alternatemarge {
public static void main(String[] args) {
	 int a[]={1,3,5,7};
	    int b[]={2,4,6,8,9,10};
	   int [] c = new int [a.length+b.length]; // 4+4
	   
	   int i=0;
	   int j=0;
	  
	  while(i<a.length || i<b.length) {
		   
	       if(i<a.length && i<b.length){
	           c[j]=a[i];
	           j++;
	           c[j]=b[i];
	           j++;
	           i++;
	       }
	       else if(i<a.length) {
	    	   c[j]=a[i];
	    	   j++;
	    	   i++;
	       }
	       else if(i<b.length) {
	    	   c[j]=b[i];
	    	   j++;
	    	   i++;
	       }
	    }
	  
	   for (int k = 0; k < c.length; k++) {
		System.out.print(c[k]+" ");
	}
}
}

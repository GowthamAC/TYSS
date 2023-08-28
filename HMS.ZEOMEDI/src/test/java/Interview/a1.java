 package Interview;


class a1{
	
public static void main(String[] args) {
	int a=-1;
	int i=2;
	int count=0;
	while(i<a/2){
	    if(a%i==0){
	        count++;
	    }
	    i++;
	}
	if(count==0){
	    System.out.println(a+" is a prime number");
	}else{
	    System.out.println(a+" not is a prime number");
	}
}
}
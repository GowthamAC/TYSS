package Interview;

import org.testng.annotations.Test;

public class thirdmax {
	@Test
	public void max3() { 
	int [] a={1,4,6,9,-1,0,9,5};
	int fmax=a[0];
	int smax=a[0];
    int tmax=a[0];
	
	for(int i=0; i<a.length;i++){
	if(a[i]<=fmax){
		if (a[i]!=fmax) {
			tmax=smax;
			smax=fmax;
		} 
	fmax=a[i];
	}
	else if(a[i]<smax || smax==fmax) {
	tmax=smax;
	smax=a[i];
	}
	else if(a[i]<tmax || tmax==smax){
	tmax=a[i];
	}
	}
	System.out.print(fmax+"  "+smax+"  "+tmax+"   ");
}
}

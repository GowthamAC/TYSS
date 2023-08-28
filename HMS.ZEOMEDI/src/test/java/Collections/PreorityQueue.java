package Collections;

import java.util.ArrayList;
import java.util.PriorityQueue;

import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

public class PreorityQueue {

	public static void main(String[] args) {
	PriorityQueue<Object> pq=new PriorityQueue<Object>();
	pq.add(10);
	pq.add(20);
	//peek--fetch first element
	System.out.println(pq.peek());
	System.out.println(pq);
	//poll--fetch first element add remove from list
    System.out.println(pq.poll());
    System.out.println(pq);
	}

}

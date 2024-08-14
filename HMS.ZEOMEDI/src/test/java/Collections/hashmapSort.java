package Collections;

import java.util.*;

public class hashmapSort {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap();
		hm.put(1, "a");
		hm.put(5, "b");
		hm.put(9, "n");
		hm.put(0, "m");
		
		Set<Integer> keys=hm.keySet();
		TreeSet<Integer> sort = new TreeSet(keys);
		for(int s:sort) {
			for(Map.Entry<Integer, String> entry : hm.entrySet()) {
				System.out.println(s+" "+hm.get(s));
				break;
			}	
		}
	}    
}

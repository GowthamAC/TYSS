 package Collections;

import java.util.Map.Entry;

public class TreeMap {

	public static void main(String[] args) {
		java.util.TreeMap<Integer, String> tm =new java.util.TreeMap<Integer, String>();
		tm.put(10, "hai");
		tm.put(40, "bye");
		tm.put(5, "one");
		tm.put(50, null);
		//System.out.println(tm);
		for (Entry<Integer, String> m : tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}

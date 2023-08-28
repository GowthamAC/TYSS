package Collections;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
	Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
	ht.put(10, "hai");
	ht.put(20, "bye");
	//ht.put(null, null);
	ht.put(30, "three");
	ht.put(20, "four");
	ht.put(50, "hai");
	System.out.println(ht);
	
	}

}

package maps;
 import java.util.*;
 import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(5, "g");
		hm.put(4, "o");
		
		//itterate using keyset
		System.out.println("itterate using keyset");
		Set<Integer> keys = hm.keySet();
		for(int key :keys) {
			System.out.println(key+" "+hm.get(key));
		}
		
		//itterate using entrySet
		System.out.println("itterate using entrySet");
		for(Map.Entry<Integer, String> entry :hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//using lamda function
//		hm.forEach((key, value) -> System.out.println(key+" "+value));
		
	}
}

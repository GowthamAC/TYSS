package Interview;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class map {
	
public static void main(String[] args) {
	
LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

hm.put("mango", 1);
hm.put("apple", 2);
hm.put("banana", 3);
hm.put("grephs", 4);

for (Entry<String, Integer> kv : hm.entrySet()) {
	
    System.out.print(kv.getKey()+" "+kv.getValue());
	
}
}
}
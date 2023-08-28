package Interview;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class findvowels {
	@Test
public void vowels() {
	String s="gowthamAC";
	s=s.toLowerCase();
	String vowels="aeiou";
	String[] str = s.split("");
	HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	
	for (int i = 0; i < str.length; i++) {
		if (vowels.contains(str[i])) {
			hmap.put(str[i], hmap.getOrDefault(str[i],0)+1);
		}
	}
	
	for(Entry<String,Integer> map:hmap.entrySet()) {
		System.out.println(map.getKey()+"  "+map.getValue());
	}
}
}

package Interview;
import java.util.*;
import java.util.Map.Entry;
public class MapRemoveDuplicate {
public static void main(String[] args) {
	
		String s="abisheka";
		char[] ch=s.toCharArray();
		LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++){
		lhm.put(ch[i],lhm.getOrDefault(ch[i], 0)+1);
		}
		 
		for(Entry<Character, Integer> map:lhm.entrySet()){
		System.out.println(map.getKey()+" "+map.getValue());
		}
}
}

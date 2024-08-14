package StringProgram;

import java.util.LinkedHashMap;

public class occurencyByMap {
	 public static void main(String[] args) {

	      String str="ssahhcii";
	      char [] ch = str.toCharArray();
	      LinkedHashMap<Character, Integer> hm = new LinkedHashMap();
	      for (int i=0; i<ch.length; i++){
	          if (hm.get(ch[i]) == null){
	              hm.put(ch[i], 1);
	          }else{
	              hm.put(ch[i], hm.get(ch[i]) +1);
	          }
	      }
	        System.out.println(hm);
	    }
}

package maps;

import java.util.*;

public class hashset_Itterator {

	public static void main(String[] args) {
		String [] str= {"abc", "def", "ijk","lmn"};
		ArrayList al =new ArrayList();
		
		for(int i=0; i<str.length; i++) {
			al.add(str[i]);
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

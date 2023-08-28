package Interview;

import java.util.LinkedList;

public class list_sort {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);list.add(3);list.add(6);list.add(1);
		int size = list.size();
		int temp=0;
		for (int i = 0; i <size; i++) {
			for (int j = i+1; j <size; j++) {
				if (list.get(i)>list.get(j)) {
					temp=list.get(i);
					list.set(i, list.get(j));
					//Here we store j value in i value
					list.set(j, temp);
				}	
		   }
		}
		System.out.println(list);

		}
}

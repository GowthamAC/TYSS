package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
       al.add(null);
       al.add(10);
       al.add(20);
       al.add("string");
       al.add('a');
       al.add(30);
       System.out.println(al);
       ArrayList<Integer> al1=new ArrayList<Integer>();
       al1.add(10);
       al1.add(20);
       al1.add(10);
       al1.add(-1);
       al1.add(200);
       System.out.println("array list before sort---");
       System.out.println(al1);
       //array sort
       Collections.sort(al1);
       System.out.println("arrat list after sort---");
       System.out.println(al1);
       //element access
       for (Object a : al1) {
		System.out.println(a);
	}
       Iterator<Object> it=al.iterator(); //using iterator
       while (it.hasNext()) {
		Object t = (Object) it.next();
		System.out.println(t);
		
	}
	}

}

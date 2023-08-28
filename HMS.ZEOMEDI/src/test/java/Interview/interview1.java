package Interview;

import java.util.LinkedList;
import java.util.TreeSet;

public class interview1 {
	//2nd largest even num
public static void main(String[] args) {
int []a= {1,4,7,5,6,8,8};
TreeSet<Integer> ts = new TreeSet<Integer>();
for (int i = 0; i < a.length; i++) {
	if (a[i]%2==0) {
		ts.add(a[i]);
	}
}
LinkedList<Integer> lhs=new LinkedList<Integer>(ts);
System.out.println(lhs.get(1));
//int size = ts.size();
//for (Integer ts1 : ts) {
//	System.out.print(ts1+" ");
//
//}
}
}
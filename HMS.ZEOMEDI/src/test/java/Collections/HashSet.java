package Collections;

public class HashSet {

	public static void main(String[] args) {
	java.util.HashSet<Object> hs=new java.util.HashSet<Object>();
	hs.add("string");
	hs.add(10);
	hs.add(null);
	hs.add(20);
	hs.add(null); //allows only 1 null
	hs.add("string"); //duplicate not allowed
	System.out.println(hs);
    System.out.println(hs.size());
    
	
	}
}

package Collections;

import io.netty.handler.codec.http.HttpServerKeepAliveHandler;

public class HashMap {

	public static void main(String[] args)  {
		java.util.HashMap<Integer, String> hm =new java.util.HashMap<Integer, String>();
		hm.put(null, null); //both key and value can be a null
		hm.put(10, "hai");
		hm.put(10, "bye"); //duplicate key is not allowed
		hm.put(20, "one");
		hm.put(30, "two");
		System.out.println(hm);
	}

}

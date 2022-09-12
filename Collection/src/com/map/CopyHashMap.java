package com.map;
import java.util.HashMap;

//Q8 WAP to copy all of the mappings from the specified HashMap to another map
public class CopyHashMap {
	public void mapIntoAnother(HashMap<Integer, String> h)
	{
        System.out.println("Before : "+h);
	    
	    HashMap<Integer, String> ha = new HashMap<Integer, String>();
	    ha.putAll(h);
	    System.out.println("After Copy Map : "+ha);
	}

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
	    h.put(10, "Java");
	    h.put(15, "C");
	    h.put(20, "C++");
	    h.put(25, "PYTHON");
	    h.put(30, "HTML");
	    
	    CopyHashMap obj = new CopyHashMap();
	    obj.mapIntoAnother(h);

	}

}

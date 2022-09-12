package com.map;

import java.util.HashMap;

public class SpecifiedKeyAndValues {
	//Q9. WAP to test if a HashMap contains a mapping for the specified key.
	public void containsKey(HashMap < String, Integer > map)
	{
		if (map.containsKey("Green"))
		{			
			 System.out.println("Yes");
		}
		else
	    {	    	
			System.out.println("No");
	    }
	}
	//Q10.WAP to test if a HashMap contains a mapping for the specified value.
	public void containsValue(HashMap < String, Integer > map)
	{
		if (map.containsValue(5))
		{			
			 System.out.println("Yes");
		}
		else
	    {	    	
			System.out.println("No");
	    }
	}
	//Q11.WAP to remove an element from HashMap using key.
	public void removeElement(HashMap < String, Integer > map)
	{
		System.out.println("Removing Key , Value : "+map.remove("Blue", 5));
		System.out.println("Map is : "+map);
	}

	public static void main(String[] args) {
		HashMap < String, Integer > map = new HashMap < String, Integer > ();
		map.put("Red", 1);
		map.put("Green", 2);
	    map.put("Black", 3);
		map.put("White", 4);
		map.put("Blue", 5);

		System.out.println("The Original map: " + map);
		
		SpecifiedKeyAndValues obj = new SpecifiedKeyAndValues();
		obj.containsKey(map);
		System.out.println("______________________________________________");
		obj.containsValue(map);
		System.out.println("______________________________________________");
		obj.removeElement(map);

	}

}

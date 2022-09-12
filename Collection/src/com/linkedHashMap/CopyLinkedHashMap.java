package com.linkedHashMap;

import java.util.LinkedHashMap;

public class CopyLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("LinkedHashMap1: " + evenNumbers);
        
        //Q7 WAP to copy a HashMap content to another LinkedHashMap.
        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(evenNumbers);
    
        System.out.println("LinkedHashMap2: " + numbers);
        
        //Q8 WAP to delete all elements from a given LinkedHashMap
        numbers.clear();
        System.out.println("Delete all elements from a given LinkedHashMap : "+numbers);

	}

}

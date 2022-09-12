package com.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

class Customer  
{
	String custName,mobile;
	int custAge;
	Customer(){}
	Customer (String name,int a,String m)
	{
		custName = name;
		custAge = a;
		mobile = m;
	}
	public String toString()
	{
		return "Customer Name : "+custName+" Age : "+custAge+" Mobile : "+mobile;
	}

}	

public class CustomerInfo {
	HashMap <String,Customer> hm;
	CustomerInfo()
	{
		hm = new HashMap<>();
	}
	public void createHashMap()
	{
		hm.put("rng45t", new Customer("Amol",32,"9765567897"));
		hm.put("Sdfgjtr", new Customer("Sohan",31,"9865431234"));
		hm.put("etwkvjer", new Customer("Aman",36,"9765432123"));
		//System.out.println(hm);
		ArrayList<Customer> list = new ArrayList<>();
		for (Entry<String, Customer> entry : hm.entrySet()) {
	            list.add(entry.getValue());
	        }
		Collections.sort(list, new Comparator<Customer>()
				{
            public int compare(Customer o1, Customer o2)
            {
                return o1.custAge-o2.custAge;
            }
            });
		System.out.println(list);
	}

	public static void main(String[] args) {
		CustomerInfo obj = new CustomerInfo();
		obj.createHashMap();

	}

}

package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Departmentt{
	Integer id;
	String depName;
	List<Students1> s;
	public Departmentt() {}
	public Departmentt(Integer id , String name,List<Students1> ls) {
		this.id=id;
		depName=name;
		s = ls;
	}
	public String toString() {
		return "dep id "+id+" dep name "+depName+s;
	}
}
class 	Students1{
	Integer roll;
	String name;
	public Students1() {}
	public Students1(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	public String toString() {
		return "roll No. : "+roll+" Name : "+name;
	}
}

public class Assignment21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Students1 s1 = new Students1(100,"Ram");
		Students1 s2 = new Students1(200,"Rushi");
		Students1 s3 = new Students1(300,"Suraj");
		List<Students1> sl = new ArrayList<>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		Students1 s11 = new Students1(101,"Akash");
		Students1 s12 = new Students1(202,"Amar");
		Students1 s13 = new Students1(303,"Siddesh");
		List<Students1> sl1 = new ArrayList<>();
		sl1.add(s11);
		sl1.add(s12);
		sl1.add(s13);
		
		Departmentt d1 = new Departmentt(10,"Comuter",sl);
		Departmentt d2 = new Departmentt(20,"Management",sl1);
		Departmentt d3 = new Departmentt(30,"Science",sl);
		
		HashMap<Integer,Departmentt> map = new HashMap<>();
		map.put(d1.id, d1);
		map.put(d2.id, d2);
		map.put(d3.id, d3);
	
		//System.out.println("mapp is "+map);
		Set<Map.Entry<Integer,Departmentt>> ent = map.entrySet();
		Iterator<Map.Entry<Integer,Departmentt>> itr = ent.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			Map.Entry<Integer,Departmentt> d =itr.next();
			//d.getKey();
			Departmentt dep = d.getValue();
			//System.out.println("depart id"+d.getKey()+"\n"+d.getValue());
			System.out.println("department id : "+d.getKey()+"\n"+dep.s);
		}

	}

}

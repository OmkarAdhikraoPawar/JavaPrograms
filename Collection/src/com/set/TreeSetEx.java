package com.set;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetEx {
	
	

	public static void main(String[] args) {
		TreeSet<Integer> tr = new TreeSet<>();
		tr.add(12);
		tr.add(34);
		tr.add(45);
		tr.add(11);
		tr.add(33);
		tr.add(48);
		System.out.println(tr);
		
		TreeSet<Integer> trs = new TreeSet<>(Collections.reverseOrder());
		trs.add(12);
		trs.add(34);
		trs.add(45);
		trs.add(11);
		trs.add(33);
		trs.add(48);
		System.out.println("Revese :");
		System.out.println(trs);

	}

}

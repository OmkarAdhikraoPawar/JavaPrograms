package com.treeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeMap;
class Book implements Comparable<Book>{
	Integer bookId,price;
	String bookName,auther;
	public Book(int bi,int bp,String bn,String an) {
		bookId = bi;
		price = bp;
		bookName = bn;
		auther = an;
	}
	public String toString() {
		return bookId+" "+price+" "+bookName+" "+auther;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(this.price>o.price) {
			return 1;
		}
	    if(this.price<o.price) {
	    	return -1;
	    }
	    else
	    	return 0;
	}
	
}
class SortByCost implements Comparator<Book>{
	public int compare(Book o,Book o1)
	{
		return o.price-o1.price;
	}

}
	

public class Written_test_q4 {

	public static void main(String[] args) {
		
     LinkedList<Book> ll = new LinkedList<>();
     Book b = new Book(10,1200,"java","Peter");
     Book b1 = new Book(20,1300,"c++","Kevin");
     Book b2 = new Book(30,1400,"mathematics","John");
     Book b3 = new Book(40,1500,"algebra","Alex");
     
     TreeMap<Integer,Book> map = new TreeMap<>();
     map.put(b.bookId, b);
     map.put(b1.bookId, b1);
     map.put(b2.bookId, b2);
     map.put(b3.bookId, b3);
     
     
     TreeMap<Book, Integer> map1 = new TreeMap<>(Collections.reverseOrder( new SortByCost()));
     map1.put(b,1);
     map1.put(b1,2);
     map1.put(b2,3);
     map1.put(b3,4);
     System.out.println(map1);
     
     
    


	}

}
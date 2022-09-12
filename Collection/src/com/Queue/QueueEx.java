package com.Queue;

import java.util.LinkedList;

public class QueueEx {
	LinkedList<String> q = new LinkedList<>();
	QueueEx()
	{
		System.out.println("List"+q);
	}

	public static void main(String[] args) {
		QueueEx o = new QueueEx();
		System.out.println(o.q);
		o.q.add("ABC");
		o.q.addFirst("AB");
		o.q.addLast("ABCD");
		
		System.out.println(o.q);
		

	}

}

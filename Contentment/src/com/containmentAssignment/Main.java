package com.containmentAssignment;

public class Main {

	public static void main(String[] args) {
		Question q = new Question();
		q.setId(1);
		q.setName("What is Java : ");
		
		SubTopic st = new SubTopic();
		st.setId(101);
		st.setName("Core Java");
		st.setQuestion(q);
		
		Topic t = new Topic();
		t.setId(501);
		t.setName("Java");
		t.setsubTopic(st);
		
		Subject sb = new Subject();
		sb.setId(10001);
		sb.setName("Java with TQ ");
		sb.setTopic(t);
				
		Branch b = new Branch();
		b.setId(201);
		b.setName("IT");
		b.setsubject(sb);
		
		Institute i = new Institute();
		i.setId(301);
		i.setName("TQ");
		i.setbranch(b);
		
		System.out.println(i);
		

	}

}

package com.dynamicPolymorphism;

public class showSalary {

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(" ** HR Salary Details ** ");
	    e = new Hr( 2," Ajay ", 40000);
		e.calculateSal(5000);
		System.out.println(e);
		
		System.out.println(" \n** Developer Salary Details ** ");
		e = new Developer( 4," Pravin ", 50000);
		e.calculateSal(2000);
		System.out.println(e);
		
		System.out.println(" \n** Manager Salary Details ** ");
		e = new Manager( 7," Rahul ", 50000);
		e.calculateSal(2000);
		System.out.println(e);
		
	}

}

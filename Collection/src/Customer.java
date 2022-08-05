

public class Customer implements Comparable<Customer> {
	int id,age;
	String name;
	Customer(){}
	Customer(int i, String n, int g)
	{
		id = i;
		name = n;
		age = g;
	}
	public String toString()
	{
		return "Customer id : "+id+"\nName : "+name+"\nAge :"+age;
		
	}
	/*public int compareTo(Customer o)
	{
		if(this.age<o.age)
		    return 1;
		else if(this.age>o.age)
			return -1;
		else
			return 0;
	}*/
	public int compareTo(Customer o)
	{
		if(this.age<o.age)
		    return -1;
		else if(this.age>o.age)
			return 1;
		else
			return 0;
	}
	

}

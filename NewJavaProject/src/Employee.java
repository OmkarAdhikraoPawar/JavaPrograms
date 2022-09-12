
public class Employee {
	int id;
	String name;
	Employee(){}
	Employee(int i,String n)
	{
		id = i;
		name = n;
	}
	public void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		Employee e = new Employee(1,"Ram");
		Employee e1 = new Employee(2,"Sham");
		e.display();
		e1.display();
		
		

	}

}

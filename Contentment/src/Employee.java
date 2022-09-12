
public class Employee {
	int id;
	String name;
	double salary;
	Department1 dept;
	MyDate mydate;
	
	Employee()  {}
	
	Employee(int id ,String name , double salary ,Department1 dept, MyDate mydate)
	{
		this.id= id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.mydate = mydate;
	}
	
	public String toString()
	{
		return " Emp Id = "+id+" Emp Name = "+name+" Salary = "+salary+" \n"+dept+" \n"+mydate;
	}

}

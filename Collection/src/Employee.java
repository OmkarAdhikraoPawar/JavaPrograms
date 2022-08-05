import java.util.ArrayList;

class Emp
{
	int id;
	String name;
	float sal;
	Emp(int id, String name, float sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString()
	{
		return "Id : "+id+"\nName : "+name+"\nSalary : "+sal;
	}
}
public class Employee {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<>();
		al.add(new Emp(1,"Ram",10000));
		al.add(new Emp(2,"Sham",20000));
		for(Emp e: al)
			System.out.println(e);
		
		
		

	}

}

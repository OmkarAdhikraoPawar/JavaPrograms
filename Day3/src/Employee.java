
public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public int getEmployeeId()
	{
		return empId;
	}
	public void setEmployeeId(int id)
	{
		empId= id;
	}
	public String getEmployeeName()
	{
		return empName;
	}
	public void setEmployeeName(String n)
	{
		empName = n;
	}
	public double getEmployeeSalary()
	{
		return salary;
	}
	public void setEmployeeSalary(int s)
	{
		salary = s;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.setEmployeeId(1);
		System.out.println("Employee Id = "+e.getEmployeeId());
		
		e.setEmployeeName("Ram");
		System.out.println("Employee Name = "+e.getEmployeeName());
		
		e.setEmployeeSalary(30000);
		System.out.println("Employee salary = "+e.getEmployeeSalary());

	}

}

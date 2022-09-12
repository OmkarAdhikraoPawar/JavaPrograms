
public class Department1 {
	int dept_id;
	String dept_name;

	Department1 () {}
	
	Department1( int dept_id , String dept_name)
	{
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}
	
	public String toString()
	{
		return " Department ID = "+dept_id+" Department Name = "+dept_name;
	}

}

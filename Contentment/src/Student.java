
public class Student {
	int rollNo;
	String name;
	
	Student()  {}
    
	Student( int rollNo , String name )
	{
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public String toString()
	{
		return " Roll No = " +rollNo+" Name = "+name;
	}

}

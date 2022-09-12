
public class Student1 
{
	int id;
	String name;
	
	Student1( )
	{
		this(1," Suraj ");
	}

	Student1(int id , String name)
	{
		this.id=id;
		this.name = name;
	}
	
	public String toString()
	{
		return " Id = "+id+"\n Name = "+name;
	}
	public static void main(String[] args) {
		Student1 s = new Student1();
	    System.out.println(s);
	    
	}

}

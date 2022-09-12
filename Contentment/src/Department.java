
public class Department {
	int dId;
	String dName;
	Student s;
	Department()  {}
    
	Department( int dId , String dName , Student s )
	{
		this.dId = dId;
		this.dName = dName;
		this.s = s;
	}
	
	public String toString()
	{
		return " Department Id = " +dId+" Department Name = "+dName+"\n"+s;
	}

}

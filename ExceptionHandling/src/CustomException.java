class AgeNotApplicableException extends RuntimeException
{
	public String getMessage()
	{
		return "Age is not Applicable for Vaccine ";
	}
}
class Person
{
	String name;
	int adharNo,age;
	
	Person(String name,int adharNo, int age)
	{
		
	}
	
	public void checkEligibityForVaccine()
	{
		if(age>16)
		{
			System.out.println("You are Applicable For Vaccine");
		}else
		{
			//throw new AgeNotApplicableException();
		}
	}
	
	public String toString()
	{
		return "Name : "+name+"\n Adhar No : "+adharNo+"\n Age"+age;
	}
	
}
public class CustomException {
	
	public static void main(String[] args) {
		//Person p = new Person();
		System.out.println();
		
		

	}

}

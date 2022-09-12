import java.util.ArrayList;

class Courses
{
	String cName, subNames;
	Courses(){}
	Courses(String n, String sn)
	{
		cName = n;
		subNames = sn;
	}
	public String toString()
	{
		return "\nCourse Name : "+cName+"\nSubjects : "+subNames;
		
	}
}
public class Institute {
	public void display()
	{
		ArrayList <Courses> al = new ArrayList <>();
		al.add(new Courses("BCA","C,C++,Java,Oracle"));
		al.add(new Courses("BBA","Marketing,Finance,Business,Accounting"));
		al.add(new Courses("MCA","Html,C#,Java,Python"));
		al.add(new Courses("MBA","Retail,Marketing Management,Financial Management,Corporate Law"));
		System.out.println(al);
	}

	public static void main(String[] args) {
		Institute obj = new Institute();
		obj.display();
	}

}

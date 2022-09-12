
public class Student {
	int id;
	String name;
	public void acceptDetails(int i,String n)
	{
		id = i;
		name = n;	
	}
	public void showDetails()
	{
		System.out.println("Student id : "+id);
		System.out.println("Student Name : "+name);
	}
	public static void main(String [] args){
		Student s = new Student();
		s.acceptDetails(1, "Ram");
		System.out.println("Student 1 ");
		s.showDetails();
		System.out.println("++++++++++++++++++++++++");
		Student s1 = new Student();
		s1.acceptDetails(2, "Sham");
		System.out.println("Student 2 ");
		s1.showDetails();
		System.out.println("++++++++++++++++++++++++");
		
		
	}

}

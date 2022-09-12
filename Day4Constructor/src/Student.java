//12
public class Student {
	String name;
	int age;
	String address;
	
	public void setInfo(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	public void setInfo(int age,String name,String address)
	{
		this.age = age;
		this.name = name;
		this.address = address;
	}
	void display()
	{
		System.out.println("Student Age : "+age);
		System.out.println("Student Name : "+name);
		System.out.println("Student Address : "+address);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.setInfo(12, "Suraj");
		s.display();
		System.out.println("++++++++++++++++++++++++++++++++++");
		s.setInfo(25, "Rushi", "A/P Satara");
		s.display();
		

	}

}

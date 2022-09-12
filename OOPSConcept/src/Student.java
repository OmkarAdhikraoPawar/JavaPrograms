
public class Student {
	int rollNo, maths, physics, chemistry;
	String name;
	public void studentDetails(int r,int m,int p,int c,String n)
	{
		rollNo = r;
		name = n;
		maths = m;
		physics = p;
		chemistry = c;
		
	}
	public void showDetails()
	{
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name of Student : "+name);
		System.out.println("Marks in Maths : "+maths);
		System.out.println("Marks in Physics : "+physics);
		System.out.println("Marks in Chemistry : "+chemistry);
		System.out.println("------------------------");
		double percentage = ((maths + physics + chemistry)* 100/300);
		System.out.println("Precentage is = "+percentage);
		
	}

}

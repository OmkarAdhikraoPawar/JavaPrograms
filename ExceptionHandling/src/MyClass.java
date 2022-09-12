import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass {
	public void method1()
	{
		try
		{
			method2();
		}
		catch(FileNotFoundException e)
		{
			
			System.out.println(e.getMessage());
		}
	}
	public void method2()throws FileNotFoundException
	{
		method3();
	}
	public void method3()throws FileNotFoundException
	{
		File file=new File("filename.txt");
		Scanner sc=new Scanner(file);
	}
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.method1();
		
	}

}

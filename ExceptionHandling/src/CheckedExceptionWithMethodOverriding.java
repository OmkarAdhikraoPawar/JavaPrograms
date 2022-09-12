import java.io.*;
class A
{	
    public void method()
	{
		  System.out.println("class A");
	}
}
class B extends A 
{
   // public void method() throws IOException 
	{	 
	    System.out.println("class A");
    }
}    
public class CheckedExceptionWithMethodOverriding {

	public static void main(String[] args) {
		A obj = new A();
		obj.method();
	}
		
}

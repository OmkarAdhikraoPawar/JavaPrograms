abstract class Parent
{
	abstract protected void cook();
	public void wash()
	{
		System.out.println("Washing the Vegetables");
	}
	Parent(String v)
	{
		v = "";
		
	}
}	
class Child extends Parent
{
	Child(String v) 
	{
		super(v);
		
	}

	public void cook()
	{
		System.out.println("Cooking Lunch");
	}
		
}

public class Abstraction {

	public static void main(String[] args) {
		Child c = new Child("Vegetable");		
		c.wash();
		c.cook();
		
		

	}

}

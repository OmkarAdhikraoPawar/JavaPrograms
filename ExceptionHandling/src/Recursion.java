
public class Recursion {
	public void add(int n, int sum)
	{
		if(n <= 10)
		{			
		    sum = sum + n;
		    n++;		
		    add(n,sum);
		}
		else
		{
		    System.out.println("Addition is = "+sum);
		}
	}	
	public static void main(String[] args) {
		Recursion obj = new Recursion();
		obj.add(1,0);
		
	}

}

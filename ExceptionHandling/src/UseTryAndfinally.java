
public class UseTryAndfinally {
	public void arithmatic()
	{
		try
		{
			int a = 20,b = 0;
			int c = a+b;
		}
		finally
		{
			System.out.println("Exception Handle");
		}
		
	}

	public static void main(String[] args) {
		UseTryAndfinally obj = new UseTryAndfinally();
		obj.arithmatic();
		
		
	}

}

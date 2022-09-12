import java.util.Scanner;

class InvalidNumberException extends Exception{

	public String getMessage()
	{
		return "Mobile number not in proper format";
	}
}


public class CutomExceptionEx {
	public void validateNumber() throws InvalidNumberException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile Number : ");
		String no= sc.next();
		if(no.matches("[0-9] {10}")){
			throw new InvalidNumberException();
		}
		else
			System.out.println("Number valid");
		
	}

	public static void main(String[] args) {
		CutomExceptionEx obj = new CutomExceptionEx();
		try
		{
			obj.validateNumber();
		}
		catch(InvalidNumberException e)
		{
			System.out.println("Error message : "+e.getMessage());
			System.out.println("Error : "+e);
		}
		finally {
			System.out.println("Task completed..");
		}

	}

}
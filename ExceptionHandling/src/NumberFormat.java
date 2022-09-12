import java.util.Scanner;
//Q13
public class NumberFormat {
	public void handlingNumberFormat()
	{
		int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any valid Integer: ");
            try 
            {
                number = Integer.parseInt(sc.next());
                System.out.println("You Entered: "+ number);
            }
            catch(NumberFormatException e)
            {
            	System.out.println("Please Enter only Numbers. ");
    			System.out.println("Exception type : "+e.getClass());
    			System.out.println("Error Message is : "+e.getMessage());
            }
            finally
            {
            	System.out.println("Finally block Execute");
            }
            sc.close();
	}
	public static void main(String[] args) {
		NumberFormat obj = new NumberFormat();
		obj.handlingNumberFormat();
		
	}

}

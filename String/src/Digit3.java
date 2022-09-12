import java.util.Scanner;
public class Digit3 {
	public static boolean findThree(int num)
	{
		boolean ispresent = false;
		while (num > 0)
		   {
		      if(num % 10 == 3)
		      {
		         return true;
		      }   
		      num = num/10;
		  }
		 return ispresent; 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPresent = false;
		//Digit3 obj = new Digit3();
		//isPresent = obj.findThree(num);
		isPresent = 
		Digit3.findThree(num);
		System.out.println(isPresent);
		
	}

}

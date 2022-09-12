import java.util.Scanner;
public class SmallestDigit {
	public void minDigit(int i)
	{
		int min=i%10;
		while( i>0 )
		{
		  if( i%10 < min)
		  {			  
			  min=i%10;
		  }
		  i=i/10;
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner ( System.in);
		System.out.println(" Enter the number = ");
		int i = sc.nextInt();
		
		SmallestDigit s = new SmallestDigit();
		s.minDigit(i);
		
        sc.close();

	}

}

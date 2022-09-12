
public class PrimeNumbers {

	public static void main(String[] args) {
        int i, num, count; 
		
		System.out.println("Prime Numbers from 1 to 50 are : ");	
		for(num = 1; num <= 50; num++)
		{
			count = 0;
		    for (i = 2; i <= num/2; i++)
		    {
		    	if(num % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && num != 1 )
		    {
		    	System.out.print(num + " ");
		    }  
		}

	}

}

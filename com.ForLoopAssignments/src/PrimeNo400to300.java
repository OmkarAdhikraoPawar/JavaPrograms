
public class PrimeNo400to300 {

	public static void main(String[] args){
        int i, num, count; 
		
		System.out.println("Prime Numbers from 400 to 300 are : ");	
		for(num = 400; num >= 300; num--)
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

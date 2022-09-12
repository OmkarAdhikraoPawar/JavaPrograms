//Q10
public class MultipleCatchBlock 
{
	public void catchBlocks()
	{		
	    try
	    { 	    	
            int a[]=new int[5];    
            a[5]=30/0;    
        }    
        catch(ArithmeticException e)  
        {  
        	System.out.println("Please do not Divided by Zero ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage()); 
        }    
        catch(ArrayIndexOutOfBoundsException e)  
        {  
        	System.out.println("Plese do not your Array out of Range ");
			System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
        }    
        catch(Exception e)  
        {  
        	System.out.println("Somthing went Wrong...");
        	System.out.println("Exception type : "+e.getClass());
			System.out.println("Error Message is : "+e.getMessage());
        }
	    finally
	    {
	    	System.out.println("Finally Block Execute");
	    }
	}
	public static void main(String[] args) {
		MultipleCatchBlock obj = new MultipleCatchBlock ();
		obj.catchBlocks();
		System.out.println("Task Completed");
	}

}

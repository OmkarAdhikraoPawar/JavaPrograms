class ItemStockUnderFlowException extends Exception
{
	public String toString()
	{
		return "Item cannot be Less than Minimum ";
	}
	public String getMessage()
	{
		return "Item should be Grater than Minimum ";
	}
} 
class ItemStockOverFlowException extends Exception
{
	public String toString()
	{
		return "Item cannot be Exceed than Maximum ";
	}
	public String getMessage()
	{
		return "Item should be Grater than Maximum ";
	}
} 
public class Store {
	int noOfItemsAvailable, maximunLevel, minimumLevel;
	public Store(int a, int b, int c)
	{
		noOfItemsAvailable = a;
		maximunLevel = b;
		minimumLevel = c;				
	}
	public void addItem(int a) throws ItemStockOverFlowException
	{
		if(noOfItemsAvailable+a>maximunLevel)
		{
			throw new ItemStockOverFlowException();
		}
		noOfItemsAvailable +=a;
	}
	public void removeItem(int b) throws ItemStockUnderFlowException
	{
		if(noOfItemsAvailable+b>minimumLevel)
		{
			throw new ItemStockUnderFlowException();
		}
		noOfItemsAvailable = b;
		checkStock();
		System.out.println("Update Stock is "+checkStock());
			
	}
	public int checkStock()
	{
		return noOfItemsAvailable;
	}
	public static void main(String[] args) {
		Store obj = new Store(70,100,25);
		try
		{
			obj.addItem(20);
			obj.removeItem(50);
		}
		catch(ItemStockOverFlowException e)
		{
			System.out.println(e.getMessage());
		}catch(ItemStockUnderFlowException e)
		{
			System.out.println(e.getMessage());
		}
		
		

	}

}

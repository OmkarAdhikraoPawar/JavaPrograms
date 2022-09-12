
public class Item {
	int itemId, cost;
	String itemName;
	Item(int i, int j, String string)
	{
		
		itemId = i;
		cost = j;
		itemName = string;	
	}
	public String toString()
	{		
		String str = "\nItem id : "+itemId+"\nCost : "+cost+"\nItem Name : "+itemName;
		return str;
	}
	/*Item(int id,int c,String n)
	{
		if(c > 200)
		{
			itemId = id;
			cost = c;
			itemName = n;
		}
		
	}*/
	
	
	public void showDetails()
	{
		System.out.println("Item Id "+itemId);
		System.out.println("Item Cost "+cost);
		System.out.println("Item Name "+itemName);
		
	}

	public static void main(String[] args) {
		
		
	}

}




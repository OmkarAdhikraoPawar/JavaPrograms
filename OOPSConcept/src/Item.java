
public class Item {
	private int itemId;
	private String name, suppName;
	private int cost;
	
	public int getItemId()
	{
		return itemId;
	}
	public void setItemId(int id)
	{
		itemId = id;
	}
	
	public int getCost()
	{
		return cost;
	}
	public void setcost(int c)
	{
		cost = c;
	}
	
	public String getItemName()
	{
		return name;
	}
	public void setItemName(String n)
	{
		name = n;
	}
	public String getSuppName()
	{
		return suppName;
	}
	
	public void setSuppName(String sn)
	{
		suppName = sn;
	}
	
	public void acceptItemDetails(int id,String s, int c, String n)
	{
		itemId = id;
		name = s;
		cost = c;
		suppName = n;
	}
	public static void main(String []args){
		Item obj = new Item();
		
		obj.setItemId(1);
		System.out.println("Item Id = "+obj.getItemId());
		
		obj.setcost(500);
		System.out.println("Cost of Item = "+obj.getCost());
		
		obj.setItemName("Shirt");
		System.out.println("Item Name = "+obj.getItemName());
		
		obj.setSuppName("Adidas");
		System.out.println("Supplyer Name = "+obj.getSuppName());
		
	}

}

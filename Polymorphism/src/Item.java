
public class Item {
	public static int cnt=1,objectCount;
	int item,qty;
	int cost;
	String itemName;
    public static double gst = 18.5;
    double bill;
	
	public void itemDetails(int cost,String itemName,int qty)
	{
		this.item = cnt++;
		this.cost = cost;
		this.itemName = itemName;
		this.qty = qty;
		objectCount++;
		
	}
	public void calculateBill()
	{
		Item.changeGST();
		cost = cost*qty;
		gst = (gst*100)/cost;
		bill = cost+gst;
		objectCount++;
		
	}
	public static void changeGST()
	{
		gst = 0.25;
	}
	public void showDetails()
	{
		System.out.println("Item : "+item);
		System.out.println("cost : "+cost);
		System.out.println("Item name : "+itemName);
		System.out.println("Quantity : "+qty);
		
		System.out.println("bill : "+bill);
		objectCount++;
		
	}

	public static void main(String[] args) {
		Item i = new Item();
		i.itemDetails(100, "Shirt",1);
		i.calculateBill();
		i.showDetails();
		System.out.println("----------------------");
		
		Item i2 = new Item();
		i2.itemDetails(200, "Shirt",2);
		i2.calculateBill();
		i2.showDetails();
		System.out.println("----------------------");
		Item i3 = new Item();
		i3.itemDetails(300, "Shirt",3);
		i3.calculateBill();
		i3.showDetails();
		
		objectCount++;

	}

}

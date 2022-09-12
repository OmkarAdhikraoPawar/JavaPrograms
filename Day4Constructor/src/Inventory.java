import java.util.Arrays;
public class Inventory {
	public void acceptItemDetails(Item i[])
	{
		i[0]= new Item(1,100,"Book");
		i[1]= new Item(2,200,"Shoe");
		i[2]= new Item(3,300,"Shirt");
		i[3]= new Item(4,100,"Note Book");
		
	}
	public void showItems(Item arr[])
	{
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j]);
		}
	}
	/*public void showCost(Item a[]) //Cost is Greater than 200
	{
		for(int k=0; k<a.length; k++)
		{
			if(a[k].cost>200)
			{
				System.out.println(a[k]);
			}
		}
	}*/
	public void minMaxCost(Item n[])//MiniMum Maximum Cost
	{
		int min=Integer.MAX_VALUE;
	    int max=Integer.MIN_VALUE;
	    for(int j=0;j<n.length;j++)
	    {
	        if(n[j].cost<min)
	        {
	           min=n[j].cost;
	        }
	        if(n[j].cost>max)
	        {
	           max=n[j].cost;
	        }
	    }
	    System.out.println("Maximum Cost is : "+max);
	    System.out.println("Minimum Cost is : "+min);
	}
	public void avgCost(Item a[])//Item cost Average
	{
		int sum = 0;
	    double average = 0;
		for (int i = 0; i < a.length; i++)
		{
            sum += a[i].cost;      
		    average = sum / a.length;                  
		} 
		System.out.println("Average of cost : "+average);
	}
	public void sameCost(Item a[])
	{
		for(int j=1;j<a.length;j++)
		{
			for(int k=j+1;k<a.length;k++)
			{
				if(a[j].cost == a[k].cost)
				{
					System.out.println(a[j]);
					System.out.println(a[k]);
					System.out.println();
				}
				
			}
		}
	}

	public static void main(String[] args) {	
		Inventory o = new Inventory();	
		Item i[] = new Item[4];	
		o.acceptItemDetails(i);
		o.showItems(i);
		System.out.println("________________________________");
		//o.showCost(i);
		System.out.println("________________________________");
		o.minMaxCost(i);
		System.out.println("________________________________");
		o.avgCost(i);
		System.out.println("________________________________");
		o.sameCost(i);

	}

}

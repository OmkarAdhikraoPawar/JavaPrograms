import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;


public class CustomerInfo {
	ArrayList<Customer>l;
	public  CustomerInfo()
	{
		l = new ArrayList<Customer>();
	}
	public void createCustomerList()
	{
		Customer c = new Customer();
		l.add(new Customer(1,"Suraj",25));
		l.add(new Customer(2,"Ram",23));
		l.add(new Customer(3,"Sham",24));
		System.out.println(l);
		
	}
	public void descendingOrder()
	{
		Collections.sort(l);
		System.out.println();
		System.out.println("Decending Order : ");
		System.out.println(l);
	}
	public void ascendingOrder()
	{
		Collections.sort(l);
		System.out.println();
		System.out.println("Acending Order : ");
		System.out.println(l);
	}
	
	public void showList()
	{
		for(Customer c : l)
		{
			System.out.println(c);
		}
		System.out.println("______________________________");
		Iterator <Customer> cl = l.iterator();
		while(cl.hasNext())
		{
			Customer o = cl.next();
			System.out.println(o);
		}
			
	}
	public void minimumAge()
	{
		Iterator<Customer> cl = l.iterator();
		Customer ob = l.get(0);
		int min = ob.age;
		while(cl.hasNext())
		{
			Customer o = cl.next();
			if(min>o.age)
			{
				min = o.age;
			}
		}
		showmin(min);		
	}
	public void showmin(int min)
	{
		System.out.println();
		System.out.println("MiniMum age Customer is : ");
		Iterator <Customer> cl = l.iterator();
		while(cl.hasNext());
		{
			Customer ol = cl.next();
			if(min == ol.age)
			{
				Customer obl = ol;
				System.out.println(obl);
			}
		}
	}
	public void changeAge()
	{
		ListIterator<Customer> cml = l.listIterator();
		while(cml.hasNext())
		{
			Customer cm2 = cml.next();
			if("Ram".equals(cm2.name))
			{
				Customer newObj = new Customer ();
				newObj.id = cm2.id;
				newObj.age = 62;
				newObj.name = cm2.name;
				cml.set(newObj);
			}
		}
		
	}

	public static void main(String[] args) {
		CustomerInfo obj = new CustomerInfo();
		obj.createCustomerList();
		//obj.descendingOrder();
		obj.ascendingOrder();
		//obj.showList();
		//obj.minimumAge();
		//obj.changeAge();
		
	}

}

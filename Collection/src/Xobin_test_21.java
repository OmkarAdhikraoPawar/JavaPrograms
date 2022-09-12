import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Xobin_test_21 {
	public void removeDublicate(ArrayList<Integer> l) {
		ArrayList<Integer> arl = new ArrayList<>();
		
		/*for(int i=0;i<al.size()-1;i++) 
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.remove(j);
				}		
			}
			arl.add(al.get(i));
		}
		for(int i=0;i<arl.size();i++)
		{
	     	System.out.print(arl.get(i)+" ");
		}*/
		arl.addAll(l);
		/*if (arl.size() > 1) 
		{
		    Iterator<Integer> it = arl.iterator();
		    Integer prev = it.next();
		    while (it.hasNext())
		    {
		        Integer current = it.next();
		        if (prev.equals(current))
		        {
		            it.remove();
		        } else 
		        {
		            prev = current;
		         
		        }
		    }
		    
		}
		System.out.println("Unique: " + arl);*/
		ListIterator<Integer> it = arl.listIterator();
		while (it.hasNext()) {
		    int i = it.nextIndex();
		    Integer current = it.next();
		    for (int j = 0; j < i; ++j) {
		        if (current.equals(arl.get(j))) {
		            it.remove();
		            break;
		        }
		    }
		}
		for(int k=0;k<arl.size();k++)
		{
		    System.out.print(arl.get(k)+" ");
		}    
	}

	public static void main(String[] args) {
		
       ArrayList<Integer> l = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number");
       for(int i=0;i<5;i++) {
    	   l.add(sc.nextInt());
       }
       Xobin_test_21 obj = new Xobin_test_21();
       obj.removeDublicate(l);
       
	}

}

	
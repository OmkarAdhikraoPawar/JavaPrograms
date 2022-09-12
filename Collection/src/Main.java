import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SortByLength implements Comparator<String>
{
	public int compare( String o1 , String o2)
	{
		return o1.length() - o2.length();
		
	}
}

public class Main 
{ 
	public ArrayList<String> arrangeWords(ArrayList<String> al)
	{
		Collections.sort(al, new SortByLength());
		return al;
	}
    
	public ArrayList<String> prepareList(String s)
	{
		Scanner sc = new Scanner (System.in);
		ArrayList<String> list = new ArrayList<>();
		String [] word = s.split(" ");
		for ( String val : word)
		{
	       if(val != " ")
	       {
	    	   list.add(val);
	    	}
		}
		sc.close();
		list = arrangeWords(list);
		return list;
	
	}
	public static void main(String[] args)
	{
        Main o = new Main();
        Scanner sc = new Scanner(System.in);
   //     System.out.println(" Enter the String = ");
        String str = sc.nextLine();
        ArrayList<String> list1 = new ArrayList<>();
        list1 = o.prepareList(str);
        
        for(int i=0; i<list1.size(); i++)
        {
        	System.out.print(list1.get(i)+" ");
        }
        sc.close();
	}

}
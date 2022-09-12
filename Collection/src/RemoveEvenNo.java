import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class RemoveEvenNo {

	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num");
		for(int i=0;i<10;i++)
		{
			al.add(sc.nextInt());
		}
	    /*Iterator<Integer> itr = al.iterator(); 
        while(itr.hasNext())
        {
        	Integer num = itr.next();
        	if(num%2 == 0)
        	{
        		itr.remove();
        	}
        		
        }
        for(int j=0;j<al.size();j++)
        {
            System.out.print(al.get(j)+" ");
        }*/
		for(int i=0;i<al.size();i++)
		{ 
			if(al.get(i)%2 != 0)
			{
				System.out.print(al.get(i)+" ");
			}
		}
		sc.close();
		sc.close();
	}

}

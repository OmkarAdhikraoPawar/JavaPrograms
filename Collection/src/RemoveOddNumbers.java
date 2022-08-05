import java.util.ArrayList;
import java.util.Iterator;


public class RemoveOddNumbers {
	public void removeOdd(ArrayList<Integer>num)
	{
		Iterator<Integer> numbersIterator = num.iterator();
		while (numbersIterator.hasNext())
		{
            Integer n = numbersIterator.next();
            if(n % 2 != 0)
            {
                numbersIterator.remove();
            }
        }
        System.out.println(num);
	}
	public static void main(String[] args) {
		 ArrayList<Integer> num = new ArrayList<>();
	     num.add(13);
	     num.add(18);
	     num.add(25);
	     num.add(40);
	     num.add(11);
	     num.add(20);
	     num.add(30);
	     num.add(50);
	     
	     RemoveOddNumbers obj = new RemoveOddNumbers();
	     obj.removeOdd(num);

	}

}

import java.util.ArrayList;
import java.util.ListIterator;


public class UsingForLoop {
	public void usingForLoop(ArrayList<String>languages)
	{
		ListIterator<String> iterate = languages.listIterator();
	    System.out.println("Iterating over ArrayList:");
	    
	    for(;iterate.hasNext();)
	    {
	      System.out.print(iterate.next() + ", ");
	    }
	}

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<String>();
	    languages.add("Java");
	    languages.add("JavaScript");
	    languages.add("Python");
	    System.out.println("ArrayList: " + languages);    
		
	    UsingForLoop obj = new UsingForLoop();
	    obj.usingForLoop(languages);
	   
	  

	}

}

import java.util.ArrayList;

public class InsertElement {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		  al.add("Red");
		  al.add("Green");
		  al.add("Orange");
		  al.add("White");
		  al.add("Black");
		  // Print the list
		  System.out.println(al);
		  // Now insert a color at the first position of the list
		  al.add(0, "Pink");		 
		  // Print the list
		  System.out.println(al);
		 

	}

}

import java.util.ArrayList;

public class ListToArray {
	public void convertList(ArrayList<String>list)
	{
		 String[] myArray = new String[list.size()];
	      list.toArray(myArray);

	      for(int i=0; i<myArray.length; i++){
	         System.out.println("Element at the index "+i+" is : "+myArray[i]);
	      }
	}
	
   public static void main(String args[]){
      ArrayList<String> list = new ArrayList<String>();
      list.add("Apple");
      list.add("Orange");
      list.add("Banana");
      System.out.println("Contents of list : "+list);
      
      ListToArray obj = new ListToArray();
      obj.convertList(list);
     
   }
}


public class PrintLanuages {
	String languages;

	PrintLanuages()
	{
	    this.languages = "Java";
	}
	 
	PrintLanuages(String languages)
	{
	    this.languages = languages;
    }

	  public void getName() {
	    System.out.println("Programming Langauage: " + this.languages);
	  }

	  public static void main(String[] args) {
    
		 PrintLanuages obj1 = new PrintLanuages();
         PrintLanuages obj2 = new PrintLanuages("Python");
         PrintLanuages obj3 = new PrintLanuages("C");
         PrintLanuages obj4 = new PrintLanuages("C#");

	     obj1.getName();
	     obj2.getName();
	     obj3.getName();
	     obj4.getName();
	  }
	  
}	  
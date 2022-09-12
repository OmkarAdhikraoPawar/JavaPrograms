

public class Information1 {
	public void acceptInformationDetails(Information obj)
	{
		 System.out.println("Name : "+obj.name);
	     System.out.println("Age : "+obj.age);
	}

	public static void main(String[] args) {
		 
	     Information info = new Information();
	     System.out.println("Contents of the original object");
	     info.acceptDetails("Ram", 20);
	     info.displayData();
	     System.out.println("Contents of the copied object");
	     Information1 copyOfInfo = new Information1();
	     copyOfInfo.acceptInformationDetails(info);
	     info.displayData();
	    
	}

}

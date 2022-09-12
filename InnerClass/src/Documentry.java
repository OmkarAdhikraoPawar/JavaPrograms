class Document
{
    static String documentName;
	private String location;
	byte sizeInBytes;
	public void createDocument()
	{
		//createStatement();
		System.out.println("Document Created");
	}
	public void printDocument()
	{
		System.out.println("Document Printed");
	}
	public void showLocation()
	{
		System.out.println("Document/:file/:txt");
	}
	class Sentense
	{
		/*static*/ String noOfWords;   //we cannot declare static variable of inner class
		char noOfChars;
		//location = "Desktop";
		public /*static*/ void createStatement()  //we cannot declare static method of inner class
		{
			System.out.println("Statement is Created");
		} 
		public void showStatement()
		{
			documentName = "Java Programming";
			System.out.println("AFHKYEHJjt");
		}
		
	}
}
public class Documentry {

	public static void main(String[] args) {
		Document d = new Document();
		Document.Sentense s = d.new Sentense();
		s.createStatement();
		s.showStatement();
		
		

	}

}

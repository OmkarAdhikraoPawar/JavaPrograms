//question 13
public class Print {
	 public void printn(int a , char c)
	 {  		 
	     System.out.println("Integer is: "+a);
	     System.out.println("Char is: "+c);
	 }    
     public void printn(char c,int a)
     {
  	     System.out.println("Char is: "+c);
  	     System.out.println("Integer is: "+a);
     }   

	public static void main(String[] args) {
		Print obj = new Print();

        obj.printn(14, 'A');
        System.out.println("-----------------------");
        obj.printn('B', 9);

	}

}

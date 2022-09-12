package com.stringAssignment;
import java.util.Scanner;
public class UppercaseToLowercase{
	public void uppercaseToLowercase()
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter any string to convert to lowercase: ");
	    String strInput = sc.nextLine();
	    char[] ch = strInput.toCharArray();
	    for(int a = 0; a < ch.length; a++)
	    {
	        if(ch[a] >= 'A' && ch[a] <= 'Z')
	        {
	            ch[a] = (char)((int)ch[a] + 32);
	        }
	    }
	    System.out.println("string in lowercase is: ");
	    for(int a = 0; a < ch.length; a++)
	    {
	        System.out.print(ch[a]);
	    }
	    sc.close();
	}	
    public static void main(String[] args){
    	UppercaseToLowercase obj = new UppercaseToLowercase();
    	obj.uppercaseToLowercase();
	   
      
   }
}

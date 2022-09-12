import java.util.Arrays;
import java.util.Scanner;
public class OccuranceOfChar
  {
	public void occuranceChar()
	{
		  Scanner sc = new Scanner (System.in);
   	      System.out.println(" Enter the String = ");
          String str1 = sc.nextLine();
          System.out.println(" Enter the char to count occurance in given string = ");
          String str2 = sc.nextLine();
		  String temp[] = str1.split("");
		  System.out.println(Arrays.toString(temp));
          int count = 0;
          for (int i = 0; i < temp.length; i++)
           {       	  
              if (str2.equals(temp[i]))
              count++;
           }
           System.out.println("The string is: " + str1);
           System.out.println("The char " + str2 + " occurs " + count + " times in the above string");
           
           sc.close();
	}
	
	
       public static void main(String args[])
       {
    	   OccuranceOfChar obj = new OccuranceOfChar();
    	   obj.occuranceChar();
    }
 }

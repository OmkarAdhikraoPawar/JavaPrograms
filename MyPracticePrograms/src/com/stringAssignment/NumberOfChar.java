package com.stringAssignment;
import java.util.Scanner;

public class NumberOfChar {
	public void vowelConsonantsChar(String str)
	{
		int vCnt=0,cCnt=0,digits=0,spaces=0,specialChar=0;
		for(int i=0; i<=str.length()-1; i++)
		{
			char ch=str.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' 
			    ||ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U' )
			{
			        vCnt++;
			    }
			    else if((ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ))
			    { 
			        cCnt++;
			    }
			    else if(ch>='0' && ch<='9') 
			    {
			        digits++;
			    }
			    else if(ch==' ')
			    { 
			        spaces++;
			    }
			    else
			    {
			    	specialChar++;
			    }		   		    
		}
			System.out.println("Total Numbers of Vowels: "+vCnt);
			System.out.println("Total Numbers of consonants: "+cCnt);
			System.out.println("Total Numbers of digits: "+digits);
			System.out.println("Total Numbers of white space : "+spaces); 
			System.out.println("Total Numbers of Special Characters : "+specialChar);
	}
	public static void main(String[] args) {
		 String str;
		 Scanner sc = new Scanner(System.in); 		    
		 System.out.println("Enter the String  ");
		 str=sc.nextLine();
		 sc.close();
		 
		 NumberOfChar obj = new NumberOfChar();
		 obj.vowelConsonantsChar(str);

	}

}

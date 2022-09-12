package com.stringAssignment;
import java.util.Scanner;

public class PalindromeString {
	public void palindromeString()
	{		
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter the String or Number = ");
		String str = sc.nextLine();
	    String reverse = "";
		for(int i = str.length()-1;i>=0;i--)		   
	        reverse = reverse + str.charAt(i);
		    if(str.equals(reverse))
		    {
			    System.out.println(" The Given Number or String is Pallindrome ");
		    }
		    else
		    {
			    System.out.println(" The Given Number or String is  not Pallindrome ");
		    }
		    sc.close();
	}

	public static void main(String[] args){
		PalindromeString obj = new PalindromeString();
		obj.palindromeString();
				  		   
	}
}


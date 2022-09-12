package com.ForLoopAssignments;
import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		 int num,temp=0,last=0,digit=0;
	     boolean isIncreasing=true,isDecreasing=true;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number");
	     num=sc.nextInt();
	     if(isIncreasing(num) || isDecreasing(num) || num < 101)  
	        	
	        	System.out.println(num+" not a bouncy number.");  
	        	else  
	        	
	        	System.out.println(num+" is a bouncy number.");  
	          
	        
	        temp=num;

	        last=temp%10;
	        
	        while(temp>0)
	        {
	            temp=temp/10;
	            digit=temp%10;
	            boolean last0 = false;
				if(last0)
	            {
	                isIncreasing=false;
	                break;
	            }
	            last=digit;
	        }


	        temp=num;
	        last=temp%10;
	        
	        while(temp>0)
	        {

	            temp=temp/10;
	            digit=temp%10;
	            if(last>digit && temp>0)
	            {
	                isDecreasing=false;
	                break;
	            }
	            last=digit;
	        }
	        if(isDecreasing==false && isIncreasing==false)
	        {
	            System.out.println(num+" is a Bouncy Number");
	        }
	        else
	        {
	            System.out.println(num+" is not a Bouncy Number");
	        }

	}

	private static boolean isIncreasing(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean isDecreasing(int num) {
		// TODO Auto-generated method stub
		return false;
	}

}

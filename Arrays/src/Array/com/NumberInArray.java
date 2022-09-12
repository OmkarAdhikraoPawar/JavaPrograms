package Array.com;
import java.util.Scanner;

public class NumberInArray {
	public void checkNumber(int a[], int no) 
   { 
		
	    int count=0; 
	    for(int x: a) 
	    { 
	      if(x==no) 
	      { 
	         count=1; 
	      }  
	    } 
	    if(count==1) 
	      System.out.print(no+" is Present ");  
	    else 
	      System.out.print(no+" is Not Present "); 
   } 
    public void checkCount(int a[], int no) 
    { 
    	
	    int count=0; 
	    for(int x: a) 
	    { 
	       if(x==no) 
	    { 
	    count++; 
	    } 
	    } 
	    System.out.print("\n"+count+" Times");  
   } 
	 
	  
	 public void checkPosition(int a[],int no) 
	 { 
	     System.out.print("\nAt Postion number "); 
	     for(int i=0;i<a.length;i++) 
	     { 
	        if(no==a[i]) 
	        { 
	            System.out.print(i+" "); 
	        } 
	     } 
	 } 
	  
	 public static void main(String[] args) { 
		 	  
	     Scanner sc=new Scanner(System.in); 
	     System.out.print("Enter Size of Array ::"); 
	     int n=sc.nextInt(); 
	     System.out.print("Enter the Elements ::"); 
	     int a[]=new int[n]; 
	     for(int i=0;i<n;i++) 
	     { 
	         a[i]=sc.nextInt(); 
	     } 
	     System.out.print("Enter Number to Check whether it's present or not :: "); 
	     int no=sc.nextInt(); 
	     NumberInArray se = new NumberInArray(); 
	     se.checkNumber(a,no); 
	     se.checkCount(a,no); 
	     se.checkPosition(a,no); 
	     sc.close(); 
	 }
}

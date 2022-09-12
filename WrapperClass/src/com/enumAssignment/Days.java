package com.enumAssignment;
enum Day
{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class Days {

	public static void main(String[] args) {
		Day d = Day.SUNDAY;
		switch(d)
		{
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case THURSDAY:	
		case FRIDAY:
			System.out.println("This is Week Day"); 
		            break;
		case SATURDAY:
			System.out.println("This is Week End");
		            break;
	    default:
	    	System.out.println("This is Holiday");
	    	      
		}
		

	}

}

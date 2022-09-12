package com.enumAssignment;
enum DayEx
{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
public class DayExample {

	public static void main(String[] args) {
		DayEx arr[] = DayEx.values();
		for (DayEx d : arr)
		{      
            System.out.println(d + " at index :"+ d.ordinal());
        }
		System.out.println("_________________________________________");
		System.out.println("Value of : "+DayEx.valueOf("MONDAY"));
		System.out.println("Value of : "+DayEx.valueOf("TUESDAY"));
		System.out.println("Value of : "+DayEx.valueOf("WEDNESDAY"));
		System.out.println("Value of : "+DayEx.valueOf("THURSDAY"));
		System.out.println("Value of : "+DayEx.valueOf("FRIDAY"));
		System.out.println("Value of : "+DayEx.valueOf("SATURDAY"));
		System.out.println("Value of : "+DayEx.valueOf("SUNDAY"));
		
		

	}

}

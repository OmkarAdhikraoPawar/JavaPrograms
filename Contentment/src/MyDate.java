
public class MyDate {
	 int day , year;
	 String month;
	  
	 MyDate()   {}
	  
	 MyDate( int day , String month , int year)
	 {
	     this.day = day;
	     this.month = month;
	     this.year = year;
	 }
	 public String toString()
	 {
		 return " Day = " +day+" Month = "+month+" Year = "+year;
	 }

}

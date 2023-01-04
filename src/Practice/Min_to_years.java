package Practice;

public class Min_to_years {
	
 public static void main(String[] args) {
	
	 /*
	  * Write a Java program to convert minutes into a number of years and days.
	  */
	 
	 int min = 3456789;
	 int year;
	 int days;
	 
	 int y = min / (60 * 24 ) ;
	 
	 year = y/365;
	 
	 days =( min / 60 / 24) % 365 ;
	 
	 System.out.println("3456789 minutes is "+ year+" years and " + days +" days");
	 
	 
	 
	
}
}

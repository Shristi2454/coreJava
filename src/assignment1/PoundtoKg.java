package assignment1;

import java.util.Scanner;

public class PoundtoKg {

	public static void main(String[] args) {
		
	
	float pound=0,kg=0;
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number of pounds");
	pound=sc.nextFloat();
	
	kg=0.454f*pound;
	
	System.out.println("The total number in kg is "+kg);
	
	}
}

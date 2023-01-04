package assignment;

import java.util.Scanner;

public class PrimeNumber {

	/*
	 * 1> WAP to print to check prime number
	 * 
	 */
	
	public static void main(String[] args) {
		
		int number;
		int count =0;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the number to check prime number");
		number =sc.nextInt();
		
		for (int i=2; i<number ; i++) {
	     	if (number % i == 0 ) {
			count = count +1;
			break;

		}
		}
	     if (count ==0 && number !=1 && number !=0) {
		    System.out.println(number+" is prime number");
		}
	     else {
	    	 System.out.println(number+ " is not prime number");
	     }
	}
}
		


 

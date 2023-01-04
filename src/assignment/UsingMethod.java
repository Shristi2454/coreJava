package assignment;

import java.util.Scanner;

public class UsingMethod {

	// WAP to find out simple interest and amount using 3 different method
	
	public static void main(String[] args) {
		
		input();
	
	}
	
	static void input() {
		 
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value for principle");
	    int p= sc.nextInt();
		System.out.println("Enter the value for time");
		int t= sc.nextInt();
		System.out.println("Enter the value for rate");
		int r= sc.nextInt();  
		
		sc.close();	
	
		processing(p,t,r);
	}
	
	 static void processing(int p, int t, int r) {
		 
		int SI = (p*t*r)/100;
		int A = p+SI;	
		
		output(SI,A);
	}

	static void output(int Si, int A ) {
		 
		
		System.out.println(" Total simple interest = "+ Si);
		System.out.println(" Total amount = "+ A);
			
		
	}
	
}

package assignment1;

import java.util.Scanner;

public class NegativeNo {

	public static void main(String[] args) {
		negative();
	}
	static void negative() {
		int x;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number ");
		x=sc.nextInt();
		
		if (x<0) {
			System.out.println("The number is "+x);
		}
		else {
			System.out.println("Invalid number");
		}
	}
}

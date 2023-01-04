package assignment1;

import java.util.Scanner;

public class LargestNo {
	public static void main(String[] args) {
		
		int x,y,z;
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first number");
		x=sc.nextInt();
		System.out.println("Enter second number");
		y=sc.nextInt();
		System.out.println("Enter third number");
		z=sc.nextInt();
		
		findLargest(x,y,z);
		
	}
	
	static void findLargest(int x,int y,int z) {
		
		if(x>y && x>z) {
				System.out.println("\n"+ x+ " is Largest number among all the values");
			}
		else if(y>x && y>z) {
			System.out.println("\n"+ y+ " is the largest number among all the values");
		}
		else {
			System.out.println("\n"+ z+ " is the largest number among all the values");
		}
		}
	}

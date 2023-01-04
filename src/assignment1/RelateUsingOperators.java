package assignment1;

import java.util.Scanner;

public class RelateUsingOperators {

	public static void main(String[] args) {
		int x,y;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		System.out.println("Enter the value of y");
		y=sc.nextInt();
	     num(x,y);
	}
	
	static void num(int x, int y) {
		
		
		if (x>y) {
			System.out.println(x + " is greater than "+y);
		}
		else if(x<y) {
			System.out.println(x+" is smaller than "+y);
		}
		else if (x==y) {
			System.out.println(x +" is equal to "+ y);
		}
	}

}

package assignment1;

import java.util.Scanner;

public class Sum1toN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any natural number ");
		int n= sc.nextInt();
		int s=sum(n);
		System.out.println("The sum of 1 to "+n+" = "+s);
	}
	static int sum(int n) {
		int total = 0;
		for(int i=1;i<=n;i++) {
			total=i+total;
		}
		return total;
		
	}
}

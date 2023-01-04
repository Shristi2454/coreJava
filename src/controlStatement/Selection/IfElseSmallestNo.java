package controlStatement.Selection;

import java.util.Scanner;

public class IfElseSmallestNo {

	public static void main(String[] args) {
		int n1,n2 ;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Input a number");
		n1=sc.nextInt();
		
		System.out.println("Input another number");
		n2= sc.nextInt();
		
		if(n1<n2) {
			System.out.println(n1 + " is smallest");
			
		}
		else {
			System.out.println(n2+ "is smallest");
		}
	}
}

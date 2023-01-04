package assignment1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int n1,n2, total;
		char operator;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		n1=sc.nextInt();
		System.out.println("Enter any operator [ + | - | * | / ]");
		operator=sc.next().charAt(0);
		System.out.println("Enter the second number");
		n2=sc.nextInt();
		
		switch(operator){
			
		case '+':
			total=n1+n2;
			System.out.println("The sum of two numbers is "+total);
			break;
			
		case '-':
			total=n1-n2;
			System.out.println("The difference of two numbers is "+total);
			break;
			
		case '*':
			total= n1*n2;
			System.out.println("The multiplication of two numbers is "+total);
			break;
		
		case '/':
			total= n1/n2;
			System.out.println("The division of two numbers is "+total);
			break;
			
		default:
			System.out.println("Invalid input");
			break;
		}
		
		sc.close();
		
		
	}
}

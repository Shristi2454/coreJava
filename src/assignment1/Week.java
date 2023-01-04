package assignment1;

import java.util.Scanner;

public class Week {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number from 1- 7 to get the day of the week");
		int days=sc.nextInt();
		
		switch(days) {
		
		case 1:
		    System.out.println("Sunday");
		    break;
		
		case 2:
			System.out.println("Monday");
			break;
		
		case 3:
			System.out.println("Tuesday");
			break;
		
		case 4:
			System.out.println("Wednesday");
			break;
		
		case 5:
			System.out.println("Thrusday");
			break;
		
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		
		}
	}

}

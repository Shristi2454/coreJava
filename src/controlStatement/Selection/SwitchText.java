package controlStatement.Selection;

import java.util.Scanner;

public class SwitchText {
	
	/*
	 * ========================= Switch ========================
	 * 
	 * syntax:
	 *  
	 *  switch(variable){
	 *    case 1: 
	 *     //statements
	 *    break;
	 *    
	 *    case2:
	 *     //statements
	 *    break;
	 *    ...........
	 *    ..........
	 *    default:
	 *     //statements
	 *    
	 *  }
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int day;
		
		System.out.println("Enter the number of the day");
		day = sc.nextInt();
		
		switch (day) {
		
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
			System.out.println("Thursaday");
		break;
		case 6:
			System.out.println("Friday");
		break;
		case 7 :
			System.out.println("Saturday");
		break;
		default:
			System.out.println("Invalid input"); 
		}
	}

}

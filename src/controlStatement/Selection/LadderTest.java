package controlStatement.Selection;

import java.util.Scanner;

public class LadderTest {
	/*
	 * ========================= ladder if-else (else if) ==================
	 * Syntax:
	 * 
	 *   if(condition-1){
	 *   }
	 *   else if(condition-2){
	 *   }
	 *   else-if(condition-3){
	 *   }
	 *   ..............
	 *   ...........
	 *   ......
	 *   else{
	 *   }
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int marks;
		
		System.out.println("Enter your percentage");
		marks = sc.nextInt();
		
		if(marks >= 80) {
			System.out.println("You score distinction");
		}
		else if(marks>=60){
			System.out.println("You score first division");
		}
		else if(marks>=40) {
			System.out.println("You score second divsion");
		}
		else if(marks >=30 ) {
			System.out.println("You score third division");
		}
		else {
			System.out.println("You failed");
		}
	}
}

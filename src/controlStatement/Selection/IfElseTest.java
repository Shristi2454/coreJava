package controlStatement.Selection;

import java.util.Scanner;

public class IfElseTest {

	/*
	 * ================== if-else ====================
	 * # if we have to check exactly two options (conditions)
	 * 
	 * syntax:
	 *  
	 *  if(condition){
	 *  
	 *         //statements
	 *         
	 *  }
	 *  else{
	 *  
	 *  //statements
	 *  
	 *  }
	 *  
	 */
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a number " );
		n= sc.nextInt();
		
		if (n>0) {
			System.out.println(n+ " is positive number");
		}
		else {
			System.out.println(n+ " is  negative number");
			
		}
	}
}

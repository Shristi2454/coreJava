package looping;

import java.util.Scanner;

public class DoWhileTest {

	/*
	 * =================== do-while loop ==================
	 * 
	 * syntax:
	 * 
	 * do{
	 *   //statments
	 *   //inc/dec
	 * 
	 * }while(condition);
	 */
	public static void main(String[] args) {
		
		//WAP to print multiplication table
		
		int n;
		int i=1;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number for the multiplication table");
		n=sc.nextInt();
		
		do {
			
			System.out.println(n + "x"+i+ "=" + (n*i));
			i++;
			
		}while(i<=10);
		
	}
}

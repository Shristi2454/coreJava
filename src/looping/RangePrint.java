package looping;

import java.util.Scanner;

public class RangePrint {
 
	public static void main(String[] args) {
		
		int start, end;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the start number:  ");
		start=sc.nextInt();
		
		System.out.println("Enter the end number ");
		end=sc.nextInt();
		
		for (int i=start; i<=end; i++) {
			System.out.println(i);
		}	
	}
	
}

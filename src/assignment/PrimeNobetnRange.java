package assignment;

import java.util.Scanner;

public class PrimeNobetnRange {
	
	// 2> WAP to print prime numbers between given range 

	public static void main(String[] args) {

		int start, end;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start of the number ");
		start =sc.nextInt();
		System.out.println("Enter the End of the number ");
		end= sc.nextInt();
		
		System.out.println("Prime numbers are :");

		for (int i=start; i<=end; i++){
			int count =0;
			for (int j=2 ;j< i;++j) {

			if (i%j==0 ) {

				count=count+1;

				break;

			} 
		}

		if (count==0 && i!=0 && i!=1) {
			System.out.println(i); 
		}

		}
//  sc.close();

	}
}

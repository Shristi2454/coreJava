package assignment1;

import java.util.Scanner;

public class SumAverage {
 
	public static void main(String[] args) {
	
		int sum=0,avg=0;
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the first number");
		int x=sc.nextInt();
		System.out.println("Enter the second number");
		int y=sc.nextInt();
		
		sum=x+y;
		avg=sum/2;
		
		System.out.println("The sum of "+x+ " & "+ y +" is "+ sum);
		System.out.println("The total average of "+x+ " & "+ y +" is "+avg);
		
    }
}

package array;

import java.util.Scanner;

public class BookPrice {

	public static void main(String[] args) {
		
	    float bookprice[]=new float[10];
	    float total=0.0f;
	    float avg;
	    
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("Enter the price of the book");
			bookprice[i]=sc.nextFloat();
			
		}
		for(float x: bookprice) {
			System.out.println("The price of the book is "+ x);
			total =total + x;
			
		}
		
		avg = total/10;
		System.out.println("");
		System.out.println("The total price of all the books are "+total);
		System.out.println("The average of all the book's total price is "+avg);
	}
}

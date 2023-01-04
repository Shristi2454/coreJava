package assignment1;

import java.util.Scanner;

public class FarhenheitCelsius {

	public static void main(String[] args) {
		
		float celsius=0f,farhrenheit=0f;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your temperature in celsius");
		celsius=sc.nextFloat();
		
		farhrenheit = (celsius*9/5)+32; 
		
		System.out.println("Your temperature in farhrenheit is "+farhrenheit);
		
		System.out.println("Enter your temperature in farhrenheit");

		farhrenheit=sc.nextFloat();
		
		celsius= 5*(farhrenheit-32)/9;
		
		System.out.println("Your temperature in celsius is "+celsius);
		
		
	}
}

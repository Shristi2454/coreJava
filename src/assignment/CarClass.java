package assignment;

import java.util.Scanner;

public class CarClass {
	String carName;
	String model;
	float price;
	
	void printCar() {
		System.out.println("Car");
		System.out.println("----------------");
		System.out.println("Name: "+carName);
		System.out.println("MOdel: "+model);
		System.out.println("Price "+"$"+price);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		CarClass c = new CarClass();
		System.out.println("Enter the name of the car");
		c.carName=sc.next();
		System.out.println("Enter the model of the car");
		c.model=sc.next();
		System.out.println("Enter the price of the car");
		c.price=sc.nextFloat();
		
		c.printCar();
		
	}
}

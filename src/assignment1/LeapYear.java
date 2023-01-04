package assignment1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		LeapYear();
	}
	static void LeapYear() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year");
		int y =sc.nextInt();
		
		if(y%4==0) {   //year is first divided by 4
			if(y%100==0) { //if year is century
				if(y%400==0) {  //if year is divided by 400 the year is leap year
			
		System.out.println(y+ " year is a leap year ");
				}
			}
		}
		else {
			System.out.println(y+" year is not a leap year");
		}
	}
}

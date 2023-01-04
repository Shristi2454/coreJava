package array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		
		//create array
		int age []= new int [5];
		
		//write data in array
		
		Scanner sc=new Scanner (System.in);
		for (int i=0; i<5;i++) {
			System.out.println("Enter your age");
		    age[i]=sc.nextInt();
		
		}
		
		//read data in array
		
		for(int x:age) {
		
		System.out.println(x);
		
		}
	}
}

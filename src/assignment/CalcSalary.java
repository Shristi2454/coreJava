package assignment;

import java.util.Scanner;

public class CalcSalary {
	
        /*
         *  3> WAP to calculate Total Salary as :
		 * Post              Basic Salary            Bonus              Total salary
		 * ------         ------------------       --------           ----------------
		 * MD                 250000                 23.98%                 ?
		 * CEO                367000                 17%                    ?
		 * Manager            168000                 8.9%                   ?
		 * Helper             80000                  15.75%                 ?
		 */
     public static void main(String[] args) {
		
    	 String post;
    	 double totalSal, sal ,bonus;
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println(" Enter the post");
    	 post = sc.next();
    	 
    	 System.out.println(" Enter the basic salary");
    	 sal = sc.nextDouble();
    	 
    	 System.out.println(" Enter the bonus ");
    	 bonus = sc.nextDouble();
    	 
    	 totalSal = sal + (sal*bonus)/100;
    	 
    	 switch(post) {
    	 
    	 case "MD":
    		 System.out.println("The total salary of MD is "+ totalSal);
    	 break;
    		 
    	 case "CEO":
    		 System.out.println("The total salary of CEO is "+totalSal);
    	 break;
    		
    	 case "Manager":
    		 System.out.println("The total salary of Manager is "+ totalSal);
         break;
    		 
    	 case "Helper":
    		 System.out.println("The total salary of Helper is "+ totalSal);
    	 break;
    	 default:
    		 System.out.println("Invalid input");
    		
    	 }
    	
    		 
    	 
	}
	
}

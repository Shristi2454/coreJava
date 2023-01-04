package looping;

public class ForTest {
	/*
	 * =================== Looping =============
	 * 
	 * 1> For :
	 * 
	 *     syntax:
	 *     
	 *     for(initialization; condition; increment/decrement){
	 *       //Statement
	 *     }
	 *     
	 * 2> While :
	 * 3> do While
	 */
   
	public static void main(String[] args) {
		
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
		 System.out.println(i);
			}
		 //System.out.println("Good Morning");
		 //i++ can also execute the value as it does the same
		}
	}
}

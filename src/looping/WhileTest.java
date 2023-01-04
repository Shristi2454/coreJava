package looping;

public class WhileTest {

	/* ================= while loop ============================
	 *  
	 *  syntax: 
	 *  while(condition){
	 *    //statements 
	 *    //inc/dec
	 *  }
	 */
	public static void main(String[] args) {
		
		//WAP to calculate the factorial -- 5!= 5*4*3*2 =120
		
		int n=7;
		int fact =1;
		
		while(n>1) {
			fact =fact*n;
			
		n--;
		}
		System.out.println(" Result ="+ fact);
	}
}

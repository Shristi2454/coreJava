package looping;

public class JumpTest {

	/*
	 * ============ Jumping Statement ====================
	 * 1> break; : exit from the loop
	 * 2> continue; : skip values
	 * 3> return; : exit from method
	 */
	public static void main(String[] args) {
		
		for (int i=1; i<10; i++)
		{
			if(i==6 || i==4) {
				//break;
				
				//continue;
				
				return;
			}
		  System.out.println(i);	
		}
		
		System.out.println("=========== end for loop =====");
	}
}

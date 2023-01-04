package looping;

public class EnhanceForTest {
	
	/*
	 * ================ Enhance For Loop (for each) ===============
	 * 
	 * # used to read data form collection.
	 * 
	 * syntax:
	 *  
	 *   for(data_type var: collection){
	 *    
	 *     //statements
	 *   }
	 */
	
	public static void main(String[] args) {
		
		int sum=0;
		int values[]= {12,3,45,67,8,9,0,97,57,2,4,66};
		
		for(int x: values) {
			sum=sum + x;
			System.out.println(x);
		}
		System.out.println("Total sum is "+ sum);
	}

}



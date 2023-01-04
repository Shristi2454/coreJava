package array;

public class ArrayWithMethod {

	/*
	 * ====================== Array with Method =======================
	 * 
	 *  a> array as argument 
	 *     
	 *     void sum(int a[]){
	 *     
	 *     return(array);
	 *     }
	 *     
	 *  b> array as return type
	 */
	
	public static void main(String[] args) {
		
		int data[]= {98,8,7,65,43,2,1,99,9,91,96,19,191};
		sum(data);
		smallest(data);
	}
	
	//array as argument 
	static void sum(int values[]) {
		
		int sum= 0; 
			for(int x: values) {
				sum=sum+x;
		}
			System.out.println("Total = "+sum);
	}
	
	static void smallest(int values[]) {
		
		/*
		 * int s=0;
		 
		for (int i=0; i<= svalues.length ;i++ ) {
		 if ()
		}
		*/
		
		int sv=values[0];
		
		for (int x: values) {
			if (sv>x){
				sv=x;
			}
			System.out.println("Smallest = "+sv);
		}
		
	}
}

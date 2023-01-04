package assignment1;

public class SwapNumbers {

	public static void main(String[] args) {
		int x=22;
		int y=33; 
		Swap(x,y);
	}
	
	static void Swap(int x, int y) {
		
//		int temp=x;
//	    x=y;
//	    y=temp;
	    
		x=x*y;
		y=x/y;
		x=x/y;
	    
	    System.out.println("The value of x after swapping is "+ x);
	    System.out.println("The value of y after swapping is "+y);
	}
}

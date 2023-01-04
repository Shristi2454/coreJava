package overloading;

public class Calculation {
	
	void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Sum: "+sum);
	}
	
	void sum(double a, double b, double c) {
		double sum = a + b + c;
		System.out.println("Sum: "+sum);
	}
	
	public static void main(String[] args) {
		Calculation c = new Calculation();
		c.sum(3, 90);
		c.sum(19.5, 12.6, 1.5);
	}
}

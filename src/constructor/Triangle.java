package constructor;

public class Triangle {
 
	int x,y,z;
	
	Triangle(int a, int b, int c){
		
		x=a;
		y=b;
		z=c;
	}
	void printArea() {
		int area=(x*y)/2;
		System.out.println("Area = "+area);
	}
	void printPerimeter() {
		int perimeter=(x+y+z);
		System.out.println("Perimeter = "+perimeter);
	}
	
	public static void main(String[] args) {
		Triangle t1 =new Triangle(3,4,5);
		t1.printArea();
		t1.printPerimeter();	
	}
}

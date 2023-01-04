package constructor;

public class AreaPerimeter {
	int a,b,c;

	AreaPerimeter(){
		a=3;
		b=4;
		c=5;
		
	}
	void printArea() {
		int area= (a*b)/2;
		System.out.println("Area = "+area);
	}
	void printPerimeter() {
		int perimeter=a+b+c;
		System.out.println("Perimeter = "+perimeter);
	}
	
	public static void main(String[] args) {
		AreaPerimeter ap1 = new AreaPerimeter();
	    ap1.printArea();
	    ap1.printPerimeter();
	}
}


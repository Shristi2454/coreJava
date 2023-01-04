package inheritance;

public class Cars extends Vehicle{

	private int cc;
	private int gears;
	
	public void attributesCar() {
		
		System.out.println("Speed = "+speed);
		System.out.println("Size = "+size);
		System.out.println("CC = "+cc);
		System.out.println("Gears = "+gears);
		
		attributes();
	}
	
	public static void main(String[] args) {
		 
		Cars c = new Cars();
		c.speed=200;
		c.size= 350;
		c.cc=500;
		c.gears=5;
		
		c.attributesCar();
	}
}

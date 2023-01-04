package aggregation;

public class Test {

	public static void main(String[] args) {
		
	
	Car c = new Car();
	
	c.setColor("Blue");
	c.setModel("MX800");
	c.setPrice(12000);
	
	Employee emp =new Employee();
	emp.setId(409);
	emp.setName("Bishnu");
	emp.setSalary(70000);
	emp.setCar(c);
	
	System.out.println("Id = "+emp.getId());
	System.out.println("Name = "+emp.getName());
	System.out.println("============ car Info ============");
	
	System.out.println(" Color = "+emp.getCar().getColor());
	System.out.println("Model = "+emp.getCar().getModel());
	System.out.println("Id = "+emp.getCar().getPrice());
	
	}
	
}

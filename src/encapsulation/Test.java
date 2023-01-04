package encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.setId(6677);
		c.setName("Roman");
		c.setAge(33);
		c.setCity("Pokhara");
		c.setPhone("9876543221");
		
		
		System.out.println(c);        //to print the value from object
//		System.out.println("Id = "+ c.getId());
//		System.out.println("Name = "+ c.getName());
//		System.out.println("Age = "+ c.getAge());
//		System.out.println("City = "+ c.getCity());
//		System.out.println("Phone no. = "+ c.getPhone());
		
	}
}

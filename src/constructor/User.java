package constructor;

public class User {
	
	//instance variable = comes with object, created when object is created
	String userName;
	String password;
	
	//-------------------Default Constructor-------------------------------
	
	User(){
		userName = "root";
		password = "1234";
	}
	
// -------------------------Parameterized constructor---------------------------
	
	
	//local variable
	
	User(String userName, String password){
		
		
		//this keyword used to represent instance variable/object or 'this' keyword represent current object
		//same variable name is used for better convention and make user-friendly

		this.userName = userName;
		this.password = password;
		
	}
	
	void print() {
		System.out.println("Username= "+userName);
		System.out.println("Password= "+password);
	}
	
	public static void main(String[] args) {
		
		User u = new User("ram", "sfw");
		u.print();
		
		//Object obj = new Object (java ko parent/root class)
		
		/*
		 * Class {@code Object} is the root of the class hierarchy.
		 * Every class has {@code Object} as a superclass. All objects,
		 * including arrays, implement the methods of this class.
		 */

		
	}

}

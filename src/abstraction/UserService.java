package abstraction;

import java.io.Serializable;

public interface UserService extends CommonService,TestService, Serializable{

	//int Max =500;
	void addUser();
	
	void deleteUser(); 

	void print();
	
	//to add the function in the interface
	default void searchUser() {
		
	}
}

package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest {

	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("d://product.txt",true);  //true appends the text and doesnot create new file always
		
		file.write("\n\nId = 9880\n");
		file.write("Name = Laptop\n");
		file.write("Company = Apple\n");
		file.write("Price = 110000\n");
		file.write("Quantity = 100\n");
		
		file.close();
		System.out.println("Sucess");
	}
}

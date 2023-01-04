package javacollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		
		List<Integer> list  = Arrays.asList(1,34,4,32,54,5,3,3,2,23);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Collections.fill(list,80);
		System.out.println(list);
	}
	
}

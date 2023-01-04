package javacollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		Integer [] data = {2,3,4,5,6,7,8,9,0,87,65,43,22};
		
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(data));
		System.out.println(list1);
	
		
		List<String> list = new LinkedList<>();
//		List<String> list = new ArrayList<>();
		
		list.add("Nepal");
		list.add("China");
		list.add("Canada");
		list.add("Korea");
		
//		list.clear();
//		list.remove(2);
//		list.remove("China");
		
		System.out.println(list.contains("China"));
		
//		for(String s : list) {         //enhanced for loop
//			System.out.println(s);    
//		}
		
		list.forEach(s->System.out.println(s));  //for each loop
		
		System.out.println(list);
	}
	
}

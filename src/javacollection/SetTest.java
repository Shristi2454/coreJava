package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		
//		Set<String> hset = new TreeSet<>(); //gives unique data and in alphabetical order
//		Set<String> hset = new HashSet<>(); //gives only unique data
		Set<String> hset = new LinkedHashSet<>(); //gives only unique data and gets as the order of set (input)
		
		hset.add("java");
		hset.add("php");
		hset.add("java");
		hset.add("html");
		hset.add("php");
		hset.add("react");
		hset.add("android");
		
		
		for (String s : hset) {
			System.out.println(s);
		}
	}
}

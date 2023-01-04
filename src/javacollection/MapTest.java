package javacollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class MapTest {

	public static void main(String[] args) {
		
//		Map<String,Integer> hmap = new HashMap<>();
//		Map<String,Integer> hmap = new TreeMap<>();
		Map<String,Integer> hmap = new LinkedHashMap<>();
		
		hmap.put("ram", 90);
		hmap.put("shram", 23);
		hmap.put("mandip", 44);
		hmap.put("radha", 54);
		hmap.put("aardi", 89);
		hmap.put("anup", 65);
		
		for(String key: hmap.keySet()) {
			System.out.println(key+ " = "+hmap.get(key));
		}
		
		
		Map<String, List<String>> tsmap = new HashMap<>();
		
		tsmap.put("Hari sir", Arrays.asList(new String[] {"asr","ppp","ttt"}));
		tsmap.put("Ram Sir", Arrays.asList(new String[] {"eee","rrr","sss","rs","fff"})); 
		
		for(String key: tsmap.keySet()) {
			
			List<String> slist = tsmap.get(key);
			System.out.println(key+" = "+slist);
			
		}
	}
}

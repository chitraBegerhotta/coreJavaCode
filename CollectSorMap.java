package learnJava3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectSorMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(treeMap);
		
	}
	public static void testMap(Map<Integer, String> map){
		
		map.put(5, "Goat");
		map.put(4, "Bat");
		map.put(11, "Rat");
		map.put(7, "Dog");
		map.put(9, "Cat");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			
			String value = entry.getValue();
			int key = entry.getKey();
			System.out.println(key + ":" + value);
		}
		
	}		
		
}	



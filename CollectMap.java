package learnJava3;

import java.util.HashMap;
import java.util.Map;

public class CollectMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(3,  "Troy");
		map.put(9, "George");
		map.put(7,  "Stanley");
		map.put(2,  "Peter");
		map.put(1, "John");
		map.put(5,  "Roger");
		
		String text = map.get(1);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}
}

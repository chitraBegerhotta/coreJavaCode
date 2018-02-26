package learnJava3;

import java.util.HashSet;
import java.util.Set;

public class CollectSet {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		
		if(set1.isEmpty()){
			System.out.println("There are no items in the set.");
		}
		
		set1.add("Rose");
		set1.add("Jasmine");
		set1.add("Lilly");
		set1.add("Cactus");
		set1.add("Mariegold");
		
		System.out.println(set1);
		
		for(String element: set1){
			System.out.println(element);
		}
		if(set1.contains("Cactus")){
			System.out.println("Cactus is there!");
		if(set1.contains("Palm")){
			System.out.println("Palm is there!");
		}
		else {System.out.println("No palm.");}
		}
		//set1.remove("Lilly");
		//System.out.println(set1);
		
		Set<String> set2 = new HashSet<String>();
		
		set2.add("Lotus");
		set2.add("Aloe");
		set2.add("Lilly");
		set2.add("Rose");
		set2.add("Orchid");
		
		Set<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		Set<String> difference = new HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}

}

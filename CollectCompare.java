package learnJava3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int length1 = s1.length();
		int length2 = s2.length();
		
		if (length1>length2){
			return 1;
		}
		else if (length1< length2){
			return -1;
		}
		return 0;
	}
	
}
class ReverseAlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
}

public class CollectCompare {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Dog");
		animals.add("Rabbit");
		animals.add("Frog");
		animals.add("Goat");
		animals.add("Eleplant");
		
		//Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		for(String animal: animals){
			System.out.println(animal);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(2);
		numbers.add(76);
		numbers.add(64);
		numbers.add(9);
		numbers.add(16);
		
			
		Collections.sort(numbers, new Comparator<Integer>(){
			
				@Override
				public int compare(Integer num1, Integer num2) {
					
					return num1.compareTo(num2);
				}
		});
		for(Integer number: numbers){
		System.out.println(number);
		}
	}

}

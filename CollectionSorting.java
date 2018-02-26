package learnJava3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLength implements Comparator<String> {

	
	public int compare(String s1, String s2) {
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1>l2){
			return 1;
		}
		else if(l1<l2){
			return -1;
		}
		
		return 0;
	}

	
}

public class CollectionSorting {

	public static void main(String[] args) {
		List<String> dresses = new ArrayList<String>();
		
		dresses.add("Swing");
		dresses.add("Shift");
		dresses.add("Halter");
		dresses.add("ALine");
		dresses.add("Cold Shoulder");
		
		Collections.sort(dresses, new StringLength());
		
		for(String dress: dresses){
			System.out.println(dress);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(22);
		numbers.add(13);
		numbers.add(72);
		numbers.add(221);
		numbers.add(4);
		
		Collections.sort(numbers);
		
		for(int number: numbers){
			System.out.println(number);
		}
		

	}

}

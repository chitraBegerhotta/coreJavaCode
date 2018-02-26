package learnJava3;

import java.util.ArrayList;

public class CollectAL {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(39);
		numbers.add(54);
		numbers.add(99);
		numbers.add(200);
		
		System.out.println(numbers.get(2));
		
		System.out.println("First Iteration:");
		for(int i=0; i<numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
		System.out.println("Second Iteration");
		
		for(Integer values: numbers){
			System.out.println(values);
		}
		
		}
	}



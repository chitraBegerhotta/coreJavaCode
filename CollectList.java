package learnJava3;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectList {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		
		doTimings("ArrayList", arraylist);
		doTimings1("LinkedList", linkedlist);

	}
	private static void doTimings(String string, ArrayList<Integer> arraylist) {
		for(int i=0;i<1E5;i++){
			arraylist.add(i);
		}
		long start = System.currentTimeMillis();
		
		for(int i=0;i<1E5;i++){
			arraylist.add(0,i);
		}		
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken" + (end-start) + "ms for array list" );
		
		
	}
	private static void doTimings1(String string, LinkedList<Integer> linkedlist) {
		for(int i=0;i<1E5;i++){
			linkedlist.add(i);
		}
		long start = System.currentTimeMillis();
		
		for(int i=0;i<1E5;i++){
			linkedlist.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken" + (end-start) + "ms for linked list" );
		
	}
	
		
		
	}



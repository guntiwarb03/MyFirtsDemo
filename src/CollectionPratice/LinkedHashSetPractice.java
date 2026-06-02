package CollectionPratice;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(90);
		lhs.add(50);
		lhs.add(50);
		lhs.add(90);
		lhs.add(30);
		lhs.add(20);
		
		for(int i:lhs) {
			System.out.println(i);
		}
	}
}

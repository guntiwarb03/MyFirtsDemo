package CollectionPratice;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet<Integer> st = new HashSet<>();
		st.add(60);
		st.add(50);
		st.add(10);
		st.add(20);
		st.add(80);
		st.add(60);
		
		
		for (int i:st) {
			System.out.println(i);
		}
	}
}

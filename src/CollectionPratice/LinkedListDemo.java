package CollectionPratice;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> rollNo = new LinkedList<> ();
		
		rollNo.add(100);
		rollNo.add(300);
		rollNo.add(1000);
		rollNo.add(300);
		rollNo.add(100);
		rollNo.add(500);
		rollNo.remove(4);
		for(int i:rollNo) {
			System.out.println(i);
		}
}
}
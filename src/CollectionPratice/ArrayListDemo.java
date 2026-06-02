package CollectionPratice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> rollNo = new ArrayList<> ();
		
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
		
//		ArrayList1<String> StuName = new ArrayList1<> ();
//		
//		StuName.add("Aradhya");
//		StuName.add("Nitin");
//		StuName.add("Amol");
//		StuName.add("Supriya");
//		StuName.add("");
//		for(String i:StuName) {
//			System.out.println(i);
//		}
	}
}

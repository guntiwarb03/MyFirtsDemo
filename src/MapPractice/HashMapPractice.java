package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	public static void main(String[] args) {
		
		HashMap<Integer,String> StudRecord = new HashMap<Integer,String>();
		
		StudRecord.put(1,"Amol");
		StudRecord.put(2,"Samu");
		StudRecord.put(3,"Anand");
		StudRecord.put(4,"Nitin");
		StudRecord.put(5,"Pallavi");
		StudRecord.put(6,"Zhoya");
		StudRecord.put(8,"Tush");
		StudRecord.put(7,"Siya");
		StudRecord.put(null,"Rukamini");
		
		for(Map.Entry<Integer,String> m : StudRecord.entrySet()){
		System.out.println(m.getKey() + " "+ m.getValue());	
		}
	}
}

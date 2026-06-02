package MapPractice;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> StudRecord = new LinkedHashMap<Integer,String>();
		
		StudRecord.put(1,"Amol");
		StudRecord.put(2,"Samu");
		StudRecord.put(3,"Anand");
		StudRecord.put(4,"Nitin");
		StudRecord.put(5,"Pallavi");
		StudRecord.put(6,"Zhoya");
		StudRecord.put(8,null);
		StudRecord.put(11,null);
		StudRecord.put(null,"Rukamini");
		
		for(Map.Entry<Integer,String> m : StudRecord.entrySet()){
		System.out.println(m.getKey() + " "+ m.getValue());	
		}
	}
}

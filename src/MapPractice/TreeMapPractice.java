package MapPractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
	public static void main(String[] args) {
		TreeMap<Integer,String> StudRecord = new TreeMap<Integer,String>();
		
		StudRecord.put(1,"Amol");
		StudRecord.put(2,"Samu");
		StudRecord.put(3,"Anand");
		StudRecord.put(4,"Nitin");
		StudRecord.put(50,"Pallavi");
		StudRecord.put(6,"Zhoya");
		StudRecord.put(8,null);
		StudRecord.put(11,null);
		StudRecord.put(2,"Rukamini");
		
		for(Map.Entry<Integer,String> m : StudRecord.entrySet()){
		System.out.println(m.getKey() + " "+ m.getValue());	
		}
	}
}

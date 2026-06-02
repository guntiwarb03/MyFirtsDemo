package MapPractice;

import java.util.Hashtable;
import java.util.Map;

public class HashTablePractice {
	
	public static void main(String[] args){
		
		Hashtable<Integer,String> DeptRecord = new Hashtable<Integer,String>();
		DeptRecord.put(101, "Chemistry");
		DeptRecord.put(203, "Bio");
		DeptRecord.put(110, "Maths");
		DeptRecord.put(302, "Eng");
		DeptRecord.put(401, "Phy");
		DeptRecord.put(203, "Civil");
		DeptRecord.put(101, "Chemistry");
		
		for(Map.Entry<Integer,String> m : DeptRecord.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}
	
}

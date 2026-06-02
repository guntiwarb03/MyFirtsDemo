package IteratorPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class NewIterator {
	
	public static void main(String[] args){
		TreeSet<String> str = new TreeSet<String>();
		str.add("Ananya");
		str.add("Anay");
		str.add("Baby");
		str.add("Chitra");
		str.add("Tanay");
		
		
//		Iterator<String> istr = str.iterator();
//		while(istr.hasNext()) {
//			System.out.println(istr.next());
//		}
		
		LinkedList<String> st = new LinkedList<String>();
		st.add("Ananya");
		st.add("Anay");
		st.add("Baby");
		st.add("Chitra");
		st.add("Tanay");
		
		ListIterator<String> bstr = st.listIterator();
		while(bstr.hasNext()) {
			System.out.println(bstr.next());
		}
		while(bstr.hasPrevious()) {
			System.out.println(bstr.previous());
		}
		
		
	}
	
	static{
		System.out.println("I executes first always before main block");
	}

}

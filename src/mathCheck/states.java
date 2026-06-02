package mathCheck;

import java.util.Scanner;

public class states extends GrandParents,{
		
	public static void main(String[] args) {
		
		String StateName;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sate initial: ");
		
		StateName = sc.next();
		
		if (StateName.equalsIgnoreCase("MH")) {
			System.out.println("This is state Maharastra.");
		}
		else if (StateName.equalsIgnoreCase("MP")) {
			System.out.println("This is state Madhya Padesh.");
		}
		else if (StateName.equalsIgnoreCase("UP")) {
			System.out.println("This is state Uttar Pradesh.");
		}
		else if (StateName.equalsIgnoreCase("KA")) {
			System.out.println("This is state Karnataka.");
		}
		else if (StateName.equalsIgnoreCase("TN")) {
			System.out.println("This is state Tamil Nadu.");
		}
		else {
			System.out.println("This is not state of India.");
		}
		sc.close();
	}
}
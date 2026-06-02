package mathCheck;

import java.util.Scanner;

public class marriageAge {
	int gAge;
	
	public void mar() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter gender age :");
	
	gAge = sc.nextInt();
	
	if (gAge >= 18) {
		
		System.out.println("Enter gender is eligible for marriage:");
		
	}
	
	else {
		
		System.out.println("Enter gender is not eligible for marriage:");
	}
	sc.close();
}
	
	
	public static void main(String[] args) {
		
		marriageAge ma= new marriageAge();
		
		ma.mar();
		System.out.println("Persons age should match criteria for marriage as per Indian Gov rule.");
	}
}

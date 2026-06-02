package mathCheck;

import java.util.Scanner;


public class VoteAge{
	
		int userAge;
	
	public void age() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user age : ");
		
		userAge = sc.nextInt();
		
		sc.close();	
		
		if (userAge >= 18)
		{
			System.out.println("your are adult so eligible for voting.");
		}
		
		else {
			System.out.println("your are not adult so not eligible for voting.");
		}
		
	}
		
	public static void main(String[] args) {
		
		VoteAge nd = new VoteAge();
		
		nd.age();
		
		System.out.println("\nYour are citizen of India.");
		
	}
}
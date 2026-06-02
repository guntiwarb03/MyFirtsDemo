package mathCheck;

import java.util.Scanner;

public class PensionCriteria {

	int penAge;
	
	public void CheckPension() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age of pensioner :");
	penAge = sc.nextInt();
	
	if (penAge > 60) {
		System.out.println("Person age is eligible for pension scheme.");
	}
	else{
		System.out.println("Person age is not eligible for pension scheme.");
	}
	sc.close();
	}
	public static void main(String[] args) {
		PensionCriteria pc = new PensionCriteria();
		pc.CheckPension();
		
		System.out.println("\nPlease check government rule for pension scheme");
	}
	
}

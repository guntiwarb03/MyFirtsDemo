
package mathCheck;

import java.util.Scanner;
public class tax {
	
	public void taxSlab() {
		
		int salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter anual Salary :");
		
		salary = sc.nextInt();
		
		switch(salary) {
		
		case 250000:
			System.out.println("Payble tax amount is zero");
		break;
		
		case 500000:
			System.out.println("Payble tax amount is 5%");
		break;
		
		case 750000:
			System.out.println("Payble tax amount is 10%");
		break;
		
		case 100000:
			System.out.println("Payble tax amount is 15%");
		break;
		
		case 1250000:
			System.out.println("Payble tax amount is 20%");
		break;
		
		case (1400000):
			System.out.println("Payble tax amount is 30%");
		break;
		
		default :
			System.out.println("Check with your CA for any query.");
		
		}
		
	}

	public static void main(String[] args) {
		
		tax t = new tax();
		t.taxSlab();
		System.out.println("\nTax slab is aper Indian gov. reules");
	}
}

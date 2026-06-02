package mathCheck;
import java.util.Scanner;
public class countries extends InDemo {
	
	public void countryinitial() {
		
		String countryName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter country initial :");
		
		countryName = sc.next();
		
		if(countryName.equalsIgnoreCase("IN")) {
			
			System.out.println("The name of country is India.");
		}
		else if(countryName.equalsIgnoreCase("UK")) {
			
			System.out.println("The name of country is United Kingdom.");
		}
		else if(countryName.equalsIgnoreCase("USA")) {
			
			System.out.println("The name of country is United State of America.");
		}
		else if(countryName.equalsIgnoreCase("IR")) {
			
			System.out.println("The name of country is Iran.");
		}
		else if(countryName.equalsIgnoreCase("PO")) {
			
			System.out.println("The name of country is Poland.");
		}
		else {
			System.out.println("Country name is not known.");
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		
		countries c = new countries();
		c.countryinitial();
		System.out.println("\nCheck list once.");
		EncapDemo ed = new EncapDemo();
		ed.setAge(100);
		System.out.println("Age is : "+ ed.getAge());
		
	}
}

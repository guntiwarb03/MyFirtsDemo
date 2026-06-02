package CustException;
import java.util.Scanner;
public class InvalidSchoolAge {
	
public void show() throws ownException{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter student age : ");
	int i = sc.nextInt();
	if (i>=6) {
		System.out.println("Eligible age for school now.");
	}
	else {
		throw new ownException("Dont give addmission to student.");
	}
	
}
	public static void main(String[] args) {
		InvalidSchoolAge isa = new InvalidSchoolAge();
		try {
			isa.show();
		}
		catch(ownException e) {
			e.printStackTrace();
		}
	}
}

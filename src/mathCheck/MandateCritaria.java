package mathCheck;
import java.util.Scanner;

public class MandateCritaria {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int age;
			String gender;
			
			System.out.println("Please enter your age :");	
			age =sc.nextInt();
			
			System.out.println("Plese Enter your gender :");
			gender = sc.next();
			
			if (age>=21 && gender.equalsIgnoreCase("Female")){
				
				System.out.println("Your Ladki Bahin Joyana is approved as criteria fullfil.");
			}
			
			else {
				System.out.println("Your Ladki bahi Yojana rejected due criteria is not fullfil.");
			}
			
			sc.close();
		}
	

}

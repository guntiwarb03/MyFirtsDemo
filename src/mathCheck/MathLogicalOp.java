package mathCheck;
import java.util.Scanner;
public class MathLogicalOp {
	
	public static void main(String[] args) {
		int age;
		String gender;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter your age");
		age = sc.nextInt();
		System.out.println("Please enter your gender");
		gender = sc.next();
		
		if(age >= 21 || gender.equalsIgnoreCase("Female")){
			System.out.println("Your are eligible for Ladki Bahin Yojana");
		}
		else {
			System.out.println("You are not eligible for Ladki Bahin Yojana");
		}
		sc.close();
	}
}

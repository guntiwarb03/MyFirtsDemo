package CustomException;
import java.util.Scanner;

public class ValidVoter {
	@SuppressWarnings("resource")
	public void show() throws InvaildVoterException
	{
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter age : ");
		age = sc.nextInt();
		if (age >=18) {
			System.out.println("Voter age is valid.");
		}
		else {
			throw new InvaildVoterException("Custom exception catch.");
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		ValidVoter vv = new ValidVoter();
		try {
		vv.show();
		}
		catch(InvaildVoterException e){
			e.printStackTrace();
		}
	}

}

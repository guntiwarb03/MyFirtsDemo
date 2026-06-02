package PracticeException;

public class CheckException {
	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Hi");
		int i = 10;
		try {//first try block
			String s = null;
			System.out.println(s.charAt(1));
			
			try {// second try block
				int cal = i/0;
				System.out.println("Check division may terminate program");
			}
			
			catch(ArithmeticException e){
				System.out.println("Exsecute this catch block");
			}
			
		}
		
		catch(NullPointerException e) {
			System.out.println("Check how first try block execute");
		}
		
		catch(Exception e) {
			System.out.println("Check how first try block execute");
		}
		
		
		finally{
			System.out.println("Finally block exceutes always");
		}
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");

			System.out.println("This is last block");
		
	}
	

}

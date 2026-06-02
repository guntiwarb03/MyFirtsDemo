package StringDemo;

public class NameCheck {
	
	public static void main(String[] args) {
		String str = "Pune";
		int i;
		for(i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			System.out.println("This is before reversing the string \n");
			
		}
		for(i=str.length()-1;i>=0;i--)
		
		System.out.println(str.charAt(i));
		System.out.println("This is after reversing the string \n");
	}

}

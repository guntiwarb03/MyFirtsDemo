package StingObjectPractice;

public class StringLiteralPractice {
	public static void main(String[] args){
		
		String str1 = "Pune";
		String str2 = "Pune";
		String str3 = "mumbai";
		String str4 = "Mumbai";
		
		String s = new String("Pune");
		String s1 = new String("Mumbai");
		String s2 = new String("Banglore");
		
		System.out.println("Check the string behaviour");
		System.out.println(str1.equals("Pune"));
		System.out.println(str1.charAt(3));
		System.out.println(str3.equals(s2));
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		System.out.println(str1==s);
		System.out.println(str1.startsWith("P"));
		System.out.println(str3.endsWith("i"));
		System.out.println(str1.toUpperCase());
		System.out.println(s2.toUpperCase());
		System.out.println(str1.contains("e"));
	} 
}

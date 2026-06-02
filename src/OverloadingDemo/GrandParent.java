package OverloadingDemo;

public class GrandParent {
	
	public void get(int a, int b) {
		int sum = a + b;
		System.out.println("Addition of two numbers is :" +sum);
	}
	
	public void get(int a, int b, int c) {
		int sub = a - b -c;
		System.out.println("Addition of two numbers is : " +sub);
	}
	
	public void get(String a, int b) {
		
		System.out.println("Print string first then number :" +a+" & "+b);
	}
	
	public void get(int a, String b) {
		
		System.out.println("Print string first then number :" +a+" & "+b);
	}
	

	public static void main(String[] args) {
		System.out.println("Check");
		
		GrandParent gp = new GrandParent();
		gp.get(10, 50);
		gp.get(10, "aa");
		gp.get(100, 20, 60);
		gp.get("bb", 1000);
	}
}

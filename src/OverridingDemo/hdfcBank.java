package OverridingDemo;

public class hdfcBank extends RbiRules{
	
	public void rbi() {
		System.out.println("This is HDFC intrest rate 8.75.");
	}
	public static void main(String[] args) {
		
		System.out.println("Check method overriding");
		
		RbiRules rb;
		rb = new sbiBank();
		rb.rbi();
		rb = new hdfcBank();
		rb.rbi();
	
	}

}

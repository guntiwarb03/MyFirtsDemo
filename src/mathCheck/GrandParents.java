package mathCheck;

public class GrandParents {
	
	 private int num1,num2;
	protected int num3;
	
	public GrandParents() {
		//System.out.println("I am constructor.");
	}
	
	
	public void get(){
		System.out.println("Grand parent method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GrandParents gp = new GrandParents();
		gp.get();
		gp.num1 =10;
		gp.num2 =20;
		gp.num3 =30;
		
		GrandParents gp1 = new GrandParents();
		gp1.get();
		gp1.num1 =10;
		gp1.num2 =20;
		gp1.num3 =30;
	}

}

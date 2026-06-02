package InterfaceDemo;

public class ChildOfAddition extends addition implements InterfaceGrandpa {

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Interface grandpa");
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("Interface grandpa");
	}
	
	public static void main(String[] args) {
		
		System.out.println("One class inheritated and one interface inheritaed");
		
		ChildOfAddition ca = new ChildOfAddition();
		ca.addSum();
		ca.get();
		ca.set();
	}

}

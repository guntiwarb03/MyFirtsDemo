package InterfaceDemo;

public class Child1Interface implements InterfaceChild {
	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Class inherit get method of parent interface first.");
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("Class inherit set method of parent interface first.");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Class inherit show method of parent interface second.");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Class inherit display method of parent interface second.");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Class inherit add methods from child after parent interface.");
	}
	
	public static void main(String[] args) {
		System.out.println("Class inherits interface");
		
		Child1Interface ci = new Child1Interface();
		ci.get();
		ci.set();
		ci.show();
		ci.display();
		ci.add();
	}

	
}

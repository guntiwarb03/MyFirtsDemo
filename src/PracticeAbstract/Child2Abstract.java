package PracticeAbstract;

public class Child2Abstract extends Child1Abstract{
	int n1 = 30;
	int n2 = 40;
	int sum;
	int mul;
	public  void set() {
		sum = n1+n2;
		System.out.println("Now we can call this method set method by creating object");
		System.out.println("Addition is : "+sum);
	}
	public void display() {
		mul = n1 * n2;
		System.out.println("Now we can call this display method by creating object");
		System.out.println("Addition is : "+mul);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2Abstract c1a = new Child2Abstract();
		c1a.set();
		c1a.display();
		c1a.get();
		System.out.println("As this is not abstract method we can create object");
		
		
	}

}

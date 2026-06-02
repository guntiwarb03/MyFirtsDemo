package PracticeAbstract;

public abstract class Child1Abstract extends ParentAbstract{
	int a = 100;
	int b = 20;
	int sub;
	public void get(){
		
		sub= a-b;
		System.out.println("Substraction is : "+sub);
		
		System.out.println("This one abstract method forward to child1");
	}

	public static void main(String[] args) {
		
		System.out.println("We can not create object of this abstract class");
		System.out.println("As two abstract methods of parent class are not given body \nso need to make this child1 abstract class ");

	}

}

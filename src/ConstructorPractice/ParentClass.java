package ConstructorPractice;

public class ParentClass extends GrandParentClass{
	int age;
	ParentClass(){		
		System.out.println("\nParent class constructor\n");
	}
 public void set() {
	 
	 System.out.println(super.age);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass pc = new ParentClass();
		System.out.println("Grand parent class constructor call first then parent class constructor");
	}

}

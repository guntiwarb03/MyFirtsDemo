package OverloadingDemo;

public class ParentClass extends GrandParent {

	public static void main(String[] args) {
		System.out.println("Methos overloading from other class");
		
		ParentClass pc = new ParentClass();
		pc.get(60, 40);
		pc.get(100, 20, 60);
	}
}

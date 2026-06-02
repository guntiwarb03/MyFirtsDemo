package ConstructorPractice;

public class GrandParentClass {
	String name = "Ananya";
	int age;
	int x;
	int y;
	
	GrandParentClass(){
		
		System.out.println("Print Grand parent class constructor : "+ name);
	}	
	GrandParentClass(int age){		
		System.out.println("Print Grand parent class constructor : "+age);
	}
	GrandParentClass(int x,int y){
		
		System.out.println("print the multiplication value : " + x * y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandParentClass gpc = new GrandParentClass();
		
		gpc.name = "Anamya Guntiwar";
		
		GrandParentClass pc = new GrandParentClass(72);
		
		GrandParentClass pp = new GrandParentClass(50,3);
		
		System.out.println("Constructor of grand parent class.");
	}

}

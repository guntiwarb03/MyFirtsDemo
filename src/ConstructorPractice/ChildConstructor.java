package ConstructorPractice;

public class ChildConstructor extends ParentClass{
	int x;
	int y;
	ChildConstructor(){
		System.out.println("Grand parent cons first then Parent cons and then Child cons\n");
	}
	ChildConstructor(int x,int y){
		System.out.println("Adition of numbers is : "+ x*y);
		System.out.println("\nChild constructor\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildConstructor cc = new ChildConstructor();
		ChildConstructor kc = new ChildConstructor(10,20);
		System.out.println("Grand parent cons first then Parent cons and then Child cons");
	}

}

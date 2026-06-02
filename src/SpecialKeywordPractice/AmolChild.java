package SpecialKeywordPractice;

public class AmolChild extends NamdevParent{
	int age=55;
	AmolChild(){
		super();
		System.out.println("Now check age of amol : " +this.age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmolChild ac = new AmolChild();
		System.out.println("Amol age is true.");
	}

}

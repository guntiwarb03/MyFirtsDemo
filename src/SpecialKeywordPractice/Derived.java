package SpecialKeywordPractice;

public class Derived extends Base
	{
	int x;
	int y;
	Derived(){
		
		System.out.println("checkout this is default constructor of Derived class :");
	}
	Derived(int x){
		this.x =x;
		System.out.println("checkout this : " + this.x);
	}
	Derived(int x, int y){
		
		System.out.println(x * y);
	}
	    public static void main(String args[])
	    {
	    	Derived d = new Derived();
	    	Derived nd = new Derived(20);
	    	Derived ndd = new Derived(50,5);
	    	System.out.println("This is your new method.");
	    }
	
}

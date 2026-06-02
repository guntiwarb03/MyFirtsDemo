package SpecialKeywordPractice;

public class  Base {
	    String name;
	    int age;
	    Base(){
	    	
	    	System.out.println("Default constructor of Base class : ");
	    }
	    public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
			System.out.println("Age is : "+this.age);
		}
		Base(String name){
	    	this.name = name;
	    	System.out.println("Parameterized method variable : "+ this.name);
	    	
	    }
	    
	    Base(String name, int age){
	    	this.name = name;
	    	this.age = age;
	    	System.out.println("Parameterized method variable : "+ this.name +" " + this.age);
	    	
	    }
	    public static void main(String[] args) {
	    	Base b = new Base();
	    	b.setAge(22);
	    	Base e = new Base("Ananya guntiwar");
	    	
	    	Base f = new Base("Rahul guntiwar",30);
	    	
	    	System.out.println("Check output");
		}
	}




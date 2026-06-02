package mathCheck;

public class Parent1 extends GrandParents {
	
	int age;
	
	public int getAge(){
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapDemo ed = new EncapDemo();
		ed.setAge(20);
		System.out.println("Age is : "+ ed.getAge());
		
	}


}

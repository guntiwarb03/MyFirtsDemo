package InterfaceDemo;

public class addition {
	public void addSum() {
		int num1 = 10;
		int num2 = 30;
		int sum;
		sum = num1 + num2;
		System.out.println("Addition is : "+ sum);
	}
	public static void main(String[] args) {
		System.out.println("This is addition method.");
		addition ad = new addition();
		ad.addSum();
	} 
}

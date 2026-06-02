package PracticeInheritance;
import java.util.Scanner;

public class AshokGrandparent {
	Scanner c = new Scanner(System.in);
	private int num1,num2;
	protected int num3;
	
	int sum;	
	public int show() {	
		
		System.out.println("Enter number 1 : ");
		num1 = c.nextInt();
		
		System.out.println("Enter number 2 : ");
		num2 = c.nextInt();
		
		sum =num1 + num2;
		
		System.out.println("This method will give addition of numbers : "+sum);
		
	return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AshokGrandparent agp = new AshokGrandparent();		
		agp.show();
		agp.num3 = 100;
		System.out.println("\nThis is grand parents property + "+agp.num3);
	}

}

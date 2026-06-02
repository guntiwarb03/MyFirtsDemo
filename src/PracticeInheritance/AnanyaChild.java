package PracticeInheritance;

public class AnanyaChild extends RahulParent{
	
	int pic1,pic2;
	protected int pic3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AshokGrandparent ap = new AshokGrandparent();
		ap.show();
		RahulParent rp = new RahulParent();
		rp.str3 = "Adya";
		System.out.println("\nThis is Ananya's daughter : "+rp.str3);
		System.out.println("\nAshok's and Rahul's property carry forwards to Ananya.");
		
	}

}

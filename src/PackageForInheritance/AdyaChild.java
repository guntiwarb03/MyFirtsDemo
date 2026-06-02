package PackageForInheritance;
import PracticeInheritance.AnanyaChild;
import PracticeInheritance.AshokGrandparent;

public class AdyaChild extends AshokGrandparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdyaChild ac = new AdyaChild();
		ac.show();
		ac.num3 = 200;
		System.out.println("\nnum3 is Protected variable it is visible in other package " +ac.num3);
	}

}

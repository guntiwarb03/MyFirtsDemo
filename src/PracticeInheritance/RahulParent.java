package PracticeInheritance;

public class RahulParent extends AshokGrandparent {

	String str1,str2,str3;
	
	public void FullName() {
		str1 = "Ashok";
		str2 = "Gajanan";
		str3 = "Guntiwar";
		
		System.out.println("Full name of grand parent is "+str1+" "+str2+" "+str3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AshokGrandparent agp = new AshokGrandparent();
		agp.show();
		
		System.out.println("\nAshoks property carry forwards to Rahul.\n");
		RahulParent rp = new RahulParent();
		rp.FullName();
	}

}

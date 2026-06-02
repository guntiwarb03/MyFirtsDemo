package mathCheck;

public class CapsulationDemo extends MandateCritaria {
	
	private int per;		

	public int getPer() {
		return per;
	}

	public void setPer(int per) {
		this.per = per;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CapsulationDemo cd = new CapsulationDemo();
		cd.setPer(60);
		System.out.println("Result is fail if percentage is : "+cd.getPer());
		
		EncapDemo ed =new EncapDemo();
		ed.setAge(18);
		
		System.out.println("Student age is "+ed.getAge());
		
		MandateCritaria mc = new MandateCritaria();
		mc.getClass();
		System.out.println("Check class is visible"+ mc.getClass());
		
		countries co = new countries();
		co.countryinitial();
		co.setAge(500);
		System.out.println("new class "co.getAge());
	}

}

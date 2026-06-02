package CollectionPratice;

public class ListPractice {
	
	public static void main(String[] args) {
		int rollNo[] = {1,2,3,4,5,6,7,8,9,10};
		String cityName[] = {"Aurangabad","Pune","Nashik","Ozar","Bengaluru"};
//		for(int i=0;i<rollNo.length;i++) {
//			System.out.println(rollNo[i]);
//		}
		
		for(int rr:rollNo) {
			System.out.println(rr);
		}
		
		for(String cn:cityName) {
			System.out.println(cn);
		}
	}

}

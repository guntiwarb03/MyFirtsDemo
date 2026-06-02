package ArrayPractice;

public class SingleDimeArray {
public static void main(String[] args) {
	int a[] = new int[6]; // array declaration
	a[0] = 100;
	a[1] = 100;
	a[2] = 100;
	a[3] = 100;
	a[4] = 100;
	System.out.println(a[0]+" ");
	
	int roll [] = {10,20,30,40,50,60,70};
	
	for (int j=0;j<roll.length-1;j++) {
		
		System.out.println(roll[j]+" ");
	}
	
	String city[] = {"Pune","Nanded","Mumbai","Katraj"};
	
	for(int k=0;k<city.length;k++) {
		System.out.println(city[k]+" ");
	}
	for(int s=city.length-1;s>=0;s--) {
		System.out.println(city[s]+" ");
	}
}
	
	
}

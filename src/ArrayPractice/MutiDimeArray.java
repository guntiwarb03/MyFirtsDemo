package ArrayPractice;

public class MutiDimeArray {
public static void main(String[] args) {
	int a[] [] = new int[3][4]; // declaration of muti dime array
	
	int result [][] = {{10,20,30,40},{40,50,60,80},{90,20,30,40}};
	
	for(int i=0;i<result.length;i++) {
		
		for(int j=0; j<result.length; j++) {
			
			System.out.print(result[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
}
}

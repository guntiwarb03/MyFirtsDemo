package OwnTaxException;
import java.util.Scanner;
public class TaxSlabException {
	@SuppressWarnings("resource")
	public void show() throws GeneralTaxException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you PA amount : ");
		int i = sc.nextInt();
		if(i>200000) {
			System.out.println("You are tax payer");
		}
		else {
			throw new GeneralTaxException("No need pay tax as your salary is not eligible for tax");
		}
		sc.close();
	}
	public static void main(String[] args) {
		TaxSlabException tse = new TaxSlabException();
		try {
		tse.show();
		}
		catch(GeneralTaxException e) {
			e.printStackTrace();
		}
	}

}

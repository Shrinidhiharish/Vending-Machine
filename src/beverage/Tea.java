package beverage;
import java.util.Scanner;

public class Tea extends Beverage {

	private boolean concentrationFlag;
	private boolean FlavourFalg;
	private boolean milkTypeFlag;

	public static int validateAmount(double paidAmount) {
		if (paidAmount < Denominations.getTeaPrice()) {
			return -1;
		} else
			return 0;
	}

	@Override
	public void selectDrink() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Select\n1.Strong 2.Light");
		int concentrationChoice = scan.nextInt();

		if (concentrationChoice == 1) {
			concentrationFlag = true;
		} else if (concentrationChoice == 2) {
			concentrationFlag = false;
		} else {
			System.out.println("please select valid option..");
		}

		System.out.println("Select\n1.With Suger 2.Suger Less");
		int flavourChoice = scan.nextInt();

		if (flavourChoice == 1) {
			FlavourFalg = true;
		} else if (flavourChoice == 2) {
			FlavourFalg = false;
		} else {
			System.out.println("please select valid option..");
		}

		System.out.println("Select\n1.Cow Milk 2.Goat Milk");
		int milkTypeChoice = scan.nextInt();

		if (milkTypeChoice == 1) {
			milkTypeFlag = true;
		} else if (milkTypeChoice == 2) {
			milkTypeFlag = false;
		} else {
			System.out.println("please select valid option..");
		}

	}

	@Override
	public void getDrink() {

		Denominations denomination = getDenomination();
		Double balanceReturned = denomination.returnBalance();
		System.out.println("Please collect your change..\nBalance Amount = " + balanceReturned);
		System.out.println("Enjoy your Tea!!");
	}

}
	
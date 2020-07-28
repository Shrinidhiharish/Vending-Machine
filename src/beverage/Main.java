package beverage;

	import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		int paidAmount;
		Scanner scan = new Scanner(System.in);

		System.out.println("Put your money..");
		Denominations denomination = new Denominations();
		paidAmount = scan.nextInt();
		denomination.setPaidAmount(paidAmount);

		if (paidAmount <= 0) {
			System.out.println("Please enter the valid amount...");
			return;
		}
		if (!((paidAmount % 10 == 0) || (paidAmount % 100 == 0))) {
			System.out.println("Please provide denomination of 10 or 100..");
			return;
		}

		System.out.println("Please choose an option to select your drink:");
		System.out.println("1. Coffee");
		System.out.println("2. Tea");
		System.out.println("3. Cool Drink");
		choice = scan.nextInt();

		Beverage beverage;

		switch (choice) {
		case 1:
			beverage = new Coffee();
			if (Coffee.validateAmount(paidAmount) == -1) {
				System.out.println("Insufficient amount");
				return;
			}
			beverage.setDenomination(denomination);
			denomination.setChoice(1);
			beverage.selectDrink();
			beverage.getDrink();
			break;

		case 2:
			beverage = new Tea();
			if (Tea.validateAmount(paidAmount) == -1) {
				System.out.println("Insufficient amount");
				return;
			}
			beverage.setDenomination(denomination);
			denomination.setChoice(2);
			beverage.selectDrink();
			beverage.getDrink();
			break;

		case 3:
			beverage = new CoolDrink();
			if (CoolDrink.validateAmount(paidAmount) == -1) {
				System.out.println("Insufficient amount");
				return;
			}
			beverage.setDenomination(denomination);
			denomination.setChoice(3);
			beverage.selectDrink();
			beverage.getDrink();
			break;

		default:
			System.out.println("Kindly select proper option!!");
		}
	}

}

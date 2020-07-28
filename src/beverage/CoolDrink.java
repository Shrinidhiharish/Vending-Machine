package beverage;

	public class CoolDrink extends Beverage {

	private static final String coolDrink = "CocoCola";

	public static int validateAmount(double paidAmount) {
		if (paidAmount < Denominations.getCoolDrinkPrice()) {
			return -1;
		} else
			return 0;
	}

	@Override
	public void selectDrink() {
		// TODO Auto-generated method stub
		System.out.println("*CocoCola");
	}

	@Override
	public void getDrink() {
		// TODO Auto-generated method stub
		Denominations denomination = getDenomination();
		Double balanceReturned = denomination.returnBalance();
		System.out.println("Please collect your change..\nBalance Amount = " + balanceReturned);
		System.out.println("Enjoy your CoolDrink!!");
	}

}

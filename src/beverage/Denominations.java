package beverage;

public class Denominations {


    private static final double coffeePrice = 50;
    private static final double teaPrice = 55;
    private static final double coolDrinkPrice = 30;
    private int choice;


    private int paidAmount;
    
    public static double getCoffeePrice()
    {
        return coffeePrice;
    }
    
    public static double getTeaPrice()
    {
        return teaPrice;
    }
    
    public static double getCoolDrinkPrice()
    {
        return coolDrinkPrice;
    }
    
    public void setPaidAmount(int paidAmount)
    {
        this.paidAmount = paidAmount;
    }


    public int getPaidAmount()
    {
        return paidAmount;
    }


    public void setChoice(int choice)
    {
        this.choice = choice;
    }


    public int getChoice()
    {
        return choice;
    }


    public double returnBalance()
    {
        double balance = 0.0;


        if(choice==1)
            balance = paidAmount-coffeePrice;
        else if (choice==2)
            balance = paidAmount-teaPrice;
        else if(choice==3)
            balance = paidAmount-coolDrinkPrice;
        
        return balance;
    }


}
 













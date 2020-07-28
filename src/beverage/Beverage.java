package beverage;


public abstract class Beverage {


    private Denominations denomination;



    public abstract void selectDrink();
    public abstract void getDrink();


    public void setDenomination(Denominations denomination)
    {
        this.denomination = denomination;
    }


    public Denominations getDenomination()
    {
        return denomination;
    }
}
 









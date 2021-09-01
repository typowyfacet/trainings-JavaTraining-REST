package atm.utilities;

public class AmountNotDividedBy10Exception extends Exception {

    public AmountNotDividedBy10Exception(){
        super("Incorrect amount of gold");
    }
}

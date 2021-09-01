package atm.atmdispenser;


public interface DispenseChain {

    public void setNextChain(DispenseChain nextChain);

    public void dispense(int amount);
}

package atm.atmdispenser;

import atm.utilities.AmountNotDividedBy10Exception;

public class ATMDispenseChain {

    private DispenseChain firstChain = new Dollar50Dispenser();

    public ATMDispenseChain() {
        DispenseChain secondChain = new Dollar20Dispenser();
        DispenseChain thirdChain = new Dollar10Dispenser();
        firstChain.setNextChain(secondChain);
        secondChain.setNextChain(thirdChain);
    }

    public void withdrawMoney(int amount) throws AmountNotDividedBy10Exception {
        if (amount % 10 == 0) {
            firstChain.dispense(amount);
        } else {
            throw new AmountNotDividedBy10Exception();
        }
    }
}

package atmtests;

import atm.atmdispenser.ATMDispenseChain;
import atm.utilities.AmountNotDividedBy10Exception;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThat;

public class ChainOfResponsibilityTests {

    @Test
    public void atmWithdraw10() throws AmountNotDividedBy10Exception {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        atmDispenser.withdrawMoney(10);
    }

    @Test
    public void atmWithdraw20() throws AmountNotDividedBy10Exception {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        atmDispenser.withdrawMoney(20);
    }

    @Test
    public void atmWithdraw50() throws AmountNotDividedBy10Exception {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        atmDispenser.withdrawMoney(50);
    }

    @Test
    public void atmWithdraw530() throws AmountNotDividedBy10Exception {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        atmDispenser.withdrawMoney(530);
    }

    @Test
    public void atmWithdraw63AndThrowException() {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        assertThatExceptionOfType(AmountNotDividedBy10Exception.class).isThrownBy(() -> atmDispenser.withdrawMoney(63));
    }
}

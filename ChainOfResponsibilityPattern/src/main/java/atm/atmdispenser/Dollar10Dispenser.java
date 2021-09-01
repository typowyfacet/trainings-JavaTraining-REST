package atm.atmdispenser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dollar10Dispenser implements DispenseChain {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 10) {
            int num = amount / 10;
            int remain = amount % 10;
            logger.info("Dispensing {} $10 note", num);
            if (remain != 0) {
                this.chain.dispense(remain);
            }
        } else {
            this.chain.dispense(amount);
        }
    }
}

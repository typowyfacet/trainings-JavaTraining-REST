package computer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CPU {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void freeze() {
        logger.info("Freezing CPU");
    }

    public void jump(String address) {
        logger.info("Jumping to {} address", address);
    }

    public void execute() {
        logger.info("Executing program");
    }
}

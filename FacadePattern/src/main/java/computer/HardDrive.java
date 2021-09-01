package computer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HardDrive {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public String read() {
        logger.info("Reading data from Hard Drive");
        return "0xDEADBEEF";
    }
}


package computer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Memory {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public String load(String data){
        logger.info("Loading program to memory: {}", data);
        return "6942";
    }
}

package singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Method to run in a multithreaded environment, getting a random number,
 * printing threadID and which number will be added to the sum,
 * after that invoking Singleton instance to add this number.
 */

public class MultithreadingDemo implements Runnable {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run() {
        int randomNumber = new Random().nextInt(10);
        String message = String.join(" ", "Thread:", String.valueOf(Thread.currentThread().getId()), "Adding to:", String.valueOf(randomNumber));
        logger.info(message);
        Singleton.getInstance().addToSum(randomNumber);
    }
}

package notification;

import observer.Observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import weather.Weather;

/**
 * InternetNews observer
 */
public class InternetNews implements Observer {
    private Logger logger = LogManager.getLogger(getClass());
    /**
     * implementation of update method from Observer interface
     *
     * @param weather weather object
     */
    @Override
    public void update(Weather weather) {
        logger.info("Internet : " + weather);
    }
}


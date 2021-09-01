package notification;

import observer.Observer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import weather.Weather;

/**
 * TVNews observer
 */
public class TVNews implements Observer {
    private Logger logger = LogManager.getLogger(getClass());
    /**
     * implementation of update method from Observer interface
     * @param weather weather object
     */
    @Override
    public void update(Weather weather) {
        logger.info("TV - "+weather);
    }
}

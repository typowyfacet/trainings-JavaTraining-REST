package observer;

import weather.Weather;

/**
 * interface Observer
 */
public interface Observer {
    /**
     * method update
     * @param weather weather object
     */
    void update(Weather weather);
}

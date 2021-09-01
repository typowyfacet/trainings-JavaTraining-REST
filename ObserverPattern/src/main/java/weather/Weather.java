package weather;

import observable.Observable;
import observer.Observer;

import java.util.HashSet;
import java.util.Set;

/**
 * weather class which is observed by observers
 */
public class Weather implements Observable {
    private int temperature;
    private int pressure;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    /** constructor
     *
     * @param temperature temperature
     * @param pressure pressure
     */
    public Weather(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    /**
     * implementation of registerObserver form Observable interface
     * @param observer observer
     */
    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    /**
     * implementation of unregisterObserver form Observable interface
     * @param observer observer
     */
    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    /**
     * implementation of notifyObservers form Observable interface
     */
    @Override
    public void notifyObservers() {
        for (Observer observer:registeredObservers
        ) {
            observer.update(this);
        }
    }

    /**
     * toString
     * @return string representation of weather object
     */
    @Override
    public String toString() {
        return "WeatherForecast{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                '}';
    }

    /**
     * method which changes weather
     * @param temperature temperature
     * @param pressure pressure
     */
    public void changeForecast(int temperature, int pressure){
        this.temperature=temperature;
        this.pressure=pressure;
        notifyObservers();
    }

    /**
     * getter
     * @return pressure
     */
    public int getPressure() {
        return pressure;
    }

    /**
     * getter
     * @return temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * getter
     * @return list of registered observers
     */
    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }
}
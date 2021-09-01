package observable;

import observer.Observer;
/**
 * interface Observable
 */
public interface Observable {
    /**
     * adding observer to list
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * removing observer from list
     * @param observer
     */
    void unregisterObserver(Observer observer);

    /**
     * notifying registered observers
     */
    void notifyObservers();
}

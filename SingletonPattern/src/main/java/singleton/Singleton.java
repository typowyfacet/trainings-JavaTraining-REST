package singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.CloneProtect;

import java.io.Serializable;

/**
 * Singleton class - example of Singleton Design Pattern.
 * Constructor is private, you can't create Singleton class, only access is possible by invoking Singleton.getInstance()
 * readResolve() method is the implementation of Serializable interface, prevents serialization and deserialization of object,
 * when the object is serialized is returning Singleton instance.
 * clone() method is the inherit method from CloneProtect.java to prevent cloning of the Singleton.
 * Method is Override to return instance instead of cloning.
 * Singleton is adding numbers to sum and printing value.
 */

public class Singleton extends CloneProtect implements Serializable {

    public static final Singleton instance = new Singleton();
    private static final Logger logger = LoggerFactory.getLogger(Singleton.class);

    private volatile int sum = 0;

    private Singleton() {
    }

    //prevents serialization
    protected Object readResolve() {
        return instance;
    }

    //prevents cloning objects
    @Override
    public Object clone() {
        return instance;
    }

    public static synchronized Singleton getInstance() {
        return instance;
    }

    public synchronized Singleton addToSum(int numberToAdd) {
        sum += numberToAdd;
        return this;
    }

    public Singleton printSum() {
        logger.info("Sum: {}", sum);
        return this;
    }
}
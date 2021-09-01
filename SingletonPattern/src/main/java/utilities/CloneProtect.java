package utilities;

/**
 * Implementing Cloneable interface as a base to extend the Singleton class.
 */

public class CloneProtect implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

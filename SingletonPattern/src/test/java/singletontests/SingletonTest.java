package singletontests;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import singleton.Singleton;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * singletonTest adds numbers to sum and prints sum.
 * cloningSingletonTest is trying to clone instance of Singleton and comparing hashCode of both instances.
 * serializationSingletonTest is writing an instance of Singleton to file, then is reading
 * the file to get Object and comparing hashCode of both instances.
 */

public class SingletonTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void singletonTest() {
        Singleton.getInstance()
                .printSum()
                .addToSum(5)
                .printSum();
        Singleton.getInstance()
                .addToSum(4)
                .printSum();
        Singleton.getInstance()
                .addToSum(3)
                .printSum();
        Singleton.getInstance()
                .addToSum(2)
                .printSum();
    }

    @Test
    public void cloningSingletonTest() {
        Singleton instance1 = Singleton.instance;
        Singleton instance2 = (Singleton) instance1.clone();
        logger.info("Hashcode for instance1: " + instance1.hashCode() + " | Hashcode for instance2: " + instance2.hashCode());
        Assert.assertEquals(instance1.hashCode(), instance2.hashCode());
    }

    @Test
    public void serializationSingletonTest() {
        try {
            Singleton instance1 = Singleton.instance;
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(instance1);
            out.close();
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
            Singleton instance2 = (Singleton) in.readObject();
            in.close();
            logger.info("Hashcode for instance1: " + instance1.hashCode() + " | Hashcode for instance2: " + instance2.hashCode());
            Assert.assertEquals(instance1.hashCode(), instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

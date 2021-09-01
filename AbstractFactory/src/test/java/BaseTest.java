import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 * Base test for all tests
 */
public abstract class BaseTest {
    protected static Logger log = LogManager.getLogger(BaseTest.class);

    /**
     * method is calling before all tests
     */
    @BeforeAll
    public static void beforeAllTests() {
        log.info("Before all tests");
    }

    /**
     * method is calling before each test
     */
    @BeforeEach
    public void beforeEachTests() {
        log.info("Before each test");
    }

    /**
     * method is calling after each test
     */
    @AfterEach
    public void afterEachTest() {
        log.info("After each test");
    }

    /**
     * method is calling after all tests
     */

    @AfterAll
    public static void afterAllTests() {
        log.info("After all tests");
    }
}

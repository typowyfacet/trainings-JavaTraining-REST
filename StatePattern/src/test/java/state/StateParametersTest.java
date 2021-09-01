package state;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import providers.TestData;
import providers.TestEnum;
import providers.TestTools;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(Parameterized.class)
public class StateParametersTest {
    private TestData testData;

    public StateParametersTest(TestData testData) {
        this.testData = testData;
    }

    @Parameters
    public static List<TestData> data() {
        return Arrays.asList(
                new TestData(
                        Arrays.asList(
                                TestEnum.UNLOCK,
                                TestEnum.START_ENGINE,
                                TestEnum.START_DRIVING,
                                TestEnum.STOP_DRIVING,
                                TestEnum.STOP_ENGINE,
                                TestEnum.LOCK
                        ),
                        Arrays.asList(
                                "You have just unlocked the car.",
                                "You have just started engine.",
                                "You have just start driving.",
                                "You have just stopped driving.",
                                "You have just stopped engine.",
                                "You have just locked the car."))
        );
    }

    /**
     * state test
     */
    @Test
    public void car_state_test() {
        Car car = new Car();
        TestTools.car_activity(car, testData);
        assertThat(TestTools.equalsLines(testData))
                .as("car state test")
                .isEqualTo(testData.getList().size());
    }
}
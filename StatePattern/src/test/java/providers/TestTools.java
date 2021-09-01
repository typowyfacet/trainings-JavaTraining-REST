package providers;

import state.Car;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestTools {
    public static void car_activity(Car car, TestData testData) {
        for (TestEnum entry : testData.getList()
        ) {
            switch (entry) {
                case LOCK: {
                    car.close();
                    break;
                }
                case UNLOCK: {
                    car.open();
                    break;
                }
                case START_ENGINE: {
                    car.startEngine();
                    break;
                }
                case STOP_ENGINE: {
                    car.stopEngine();
                    break;
                }
                case START_DRIVING: {
                    car.startDriving();
                    break;
                }
                case STOP_DRIVING: {
                    car.stopDriving();
                    break;
                }
            }
        }
    }

    public static int equalsLines(TestData testData) {
        int counter = 0;
        try {
            List<String> file = Files.readAllLines(Paths.get("log/test.log"));
            for (int i = testData.getList().size(); i >= 1; i--) {
                if (file.get(file.size() - testData.getList().size() - i)
                        .endsWith(testData.getOrder().get(testData.getList().size() - i))) {
                    counter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }
}
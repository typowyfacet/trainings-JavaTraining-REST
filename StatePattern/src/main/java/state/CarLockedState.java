package state;

import static state.Info.HAVE_TO_UNLOCK;
import static state.Info.HAVE_TO_START_ENGINE;
import static state.Info.HAVE_TO_START_DRIVING;
import static state.Info.JUST_UNLOCKED;
import static state.Info.ALREADY_LOCKED;

public class CarLockedState extends BaseLogger implements State {

    @Override
    public void startEngine(Car car) {
        logger.info(HAVE_TO_UNLOCK.getDescription());
    }

    @Override
    public void stopEngine(Car car) {
        logger.info(HAVE_TO_START_ENGINE.getDescription());
    }

    @Override
    public void open(Car car) {
        logger.info(JUST_UNLOCKED.getDescription());
        car.state = new CarUnlockedState();
    }

    @Override
    public void close(Car car) {
        logger.info(ALREADY_LOCKED.getDescription());
    }

    @Override
    public void startDriving(Car car) {
        logger.info(HAVE_TO_START_ENGINE.getDescription());
    }

    @Override
    public void stopDriving(Car car) {
        logger.info(HAVE_TO_START_DRIVING.getDescription());
    }
}
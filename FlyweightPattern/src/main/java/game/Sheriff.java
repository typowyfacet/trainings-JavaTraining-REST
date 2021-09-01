package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.Cowboy;

/**
 * Sheriff must have weapon and mission.
 */

public class Sheriff implements Cowboy {

    private static final Logger logger = LoggerFactory.getLogger(Sheriff.class);

    private String weapon;

    Sheriff() {
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        logger.info("Sheriff with weapon: {} | Task is KILL THE BANDIT", weapon);
    }
}

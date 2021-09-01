package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.Cowboy;

/**
 * Bandit must have weapon and mission.
 */

public class Bandit implements Cowboy {

    private static final Logger logger = LoggerFactory.getLogger(Bandit.class);

    private String weapon;

    Bandit() {
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        logger.info("Sheriff with weapon: {} | Task is KILL THE SHERIFF", weapon);
    }
}

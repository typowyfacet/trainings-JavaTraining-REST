package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.Cowboy;
import utilities.SpanishInquisitionException;


import java.util.HashMap;

/**
 * Class use to get a cowboy using HashMap:
 * - returns an existing cowboy if a cowboy type exists
 * - if cowboy doesn't exist - create new one, saves in HashMap
 * HashMap stores the reference to the object of Sheriff or Bandit
 */

public class CowboyFactory {

    private static final Logger logger = LoggerFactory.getLogger(CowboyFactory.class);

    private static HashMap<String, Cowboy> cowboyHashMap = new HashMap<>();

    private CowboyFactory() {
    }

    public static Cowboy getCowboy(String type) throws SpanishInquisitionException {

        Cowboy cowboy;

        if (cowboyHashMap.containsKey(type)) {
            cowboy = cowboyHashMap.get(type);
        } else {
            switch (type) {
                case "Sheriff":
                    logger.info("Sheriff created");
                    cowboy = new Sheriff();
                    break;
                case "Bandit":
                    logger.info("Bandit created");
                    cowboy = new Bandit();
                    break;
                default:
                    throw new SpanishInquisitionException();
            }
            cowboyHashMap.put(type, cowboy);
        }
        return cowboy;
    }
}

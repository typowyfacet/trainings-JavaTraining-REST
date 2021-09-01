package playgame;

import game.CowboyFactory;
import utilities.Cowboy;
import utilities.SpanishInquisitionException;

import java.util.Random;

/**
 * Based on cowboyTypes and weapons Cowboy is getting type and random weapon.
 */

public class WildWestBattle {

    protected WildWestBattle() {
    }

    private static final String[] cowboyTypes = {"Bandit", "Sheriff"};
    private static final String[] weapons = {"Knife", "Revolver", "Pistol", "Rifle", "Spanish Inquisition Exception"};

    private static String getRandomCowboyType() {
        return cowboyTypes[new Random().nextInt(cowboyTypes.length)];
    }

    private static String getRandomWeapon() {
        return weapons[new Random().nextInt(weapons.length)];
    }

    public static void createCowboy() throws SpanishInquisitionException {
        Cowboy cowboy = CowboyFactory.getCowboy(getRandomCowboyType());
        cowboy.assignWeapon(getRandomWeapon());
        cowboy.mission();
    }
}

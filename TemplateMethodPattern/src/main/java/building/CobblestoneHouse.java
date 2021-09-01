package building;

import enums.Materials;

import static enums.Materials.COBBLESTONE;
import static enums.Materials.BRICK;

public class CobblestoneHouse extends House {

    @Override
    Materials buildWalls() {
        return COBBLESTONE;
    }

    @Override
    Materials buildPillars() {
        return COBBLESTONE;
    }

    @Override
    Materials buildRoof() {
        return BRICK;
    }
}

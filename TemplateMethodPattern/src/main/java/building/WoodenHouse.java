package building;

import enums.Materials;

import static enums.Materials.PLATE;
import static enums.Materials.WOOD;
import static enums.Materials.COBBLESTONE;

public class WoodenHouse extends House {
    @Override
    Materials buildWalls() {
        return WOOD;
    }

    @Override
    Materials buildPillars() {
        return COBBLESTONE;
    }

    @Override
    Materials buildRoof() {
        return PLATE;
    }
}

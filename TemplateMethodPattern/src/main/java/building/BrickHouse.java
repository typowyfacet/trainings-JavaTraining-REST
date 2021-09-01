package building;

import enums.Materials;

public class BrickHouse extends House {

    @Override
    Materials buildWalls() {
        return Materials.BRICK;
    }

    @Override
    Materials buildPillars() {
        return Materials.COBBLESTONE;
    }

    @Override
    Materials buildRoof() {
        return Materials.CLAY;
    }
}

package buildingTest;

import building.BrickHouse;
import building.House;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static enums.Materials.GLASS;
import static enums.Materials.BRICK;
import static enums.Materials.COBBLESTONE;
import static enums.Materials.CLAY;

public class BrickHouseTest {

    @Test
    public void buildBrickHouseTest() {
        House house = new BrickHouse();
        house.buildHouse();
        assertThat(house.getPillars()).isEqualByComparingTo(COBBLESTONE);
        assertThat(house.getWalls()).isEqualByComparingTo(BRICK);
        assertThat(house.getWindows()).isEqualByComparingTo(GLASS);
        assertThat(house.getRoof()).isEqualByComparingTo(CLAY);
    }
}

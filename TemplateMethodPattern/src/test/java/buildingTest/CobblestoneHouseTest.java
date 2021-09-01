package buildingTest;

import building.CobblestoneHouse;
import building.House;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static enums.Materials.COBBLESTONE;
import static enums.Materials.GLASS;
import static enums.Materials.BRICK;

public class CobblestoneHouseTest {

    @Test
    public void buildCobblestoneHouseTest() {
        House house = new CobblestoneHouse();
        house.buildHouse();
        assertThat(house.getPillars()).isEqualByComparingTo(COBBLESTONE);
        assertThat(house.getWalls()).isEqualByComparingTo(COBBLESTONE);
        assertThat(house.getWindows()).isEqualByComparingTo(GLASS);
        assertThat(house.getRoof()).isEqualByComparingTo(BRICK);
    }
}

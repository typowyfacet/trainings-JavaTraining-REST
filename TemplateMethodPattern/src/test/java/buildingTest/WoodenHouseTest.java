package buildingTest;

import building.House;
import building.WoodenHouse;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static enums.Materials.GLASS;
import static enums.Materials.WOOD;
import static enums.Materials.COBBLESTONE;
import static enums.Materials.PLATE;

public class WoodenHouseTest {

    @Test
    public void buildWoodenHouseTest() {
        House house = new WoodenHouse();
        house.buildHouse();
        assertThat(house.getPillars()).isEqualByComparingTo(COBBLESTONE);
        assertThat(house.getWalls()).isEqualByComparingTo(WOOD);
        assertThat(house.getWindows()).isEqualByComparingTo(GLASS);
        assertThat(house.getRoof()).isEqualByComparingTo(PLATE);
    }
}

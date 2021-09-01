import enums.UnitType;
import factory.*;
import org.junit.jupiter.api.Test;
import units.AirUnit;
import units.ArtilleryUnit;
import units.NavalUnit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * testing the instance of units
 */
class FactoryTest extends BaseTest {
    private final FirstArmyFactory battleUnitFactory = new FirstArmyFactory();

    /**
     * test if unit is a artillery
     */
    @Test
    void created_artillery_unit_test() {
        ArtilleryUnit artilleryUnit = battleUnitFactory.createArtilleryUnit(UnitType.ARTILLERY);
        log.info(artilleryUnit);
        assertThat(artilleryUnit)
                .as("checking artillery")
                .isInstanceOf(Artillery.class);
    }

    /**
     * test if unit is a battleship
     */
    @Test
    void created_battleship_unit_test() {
        NavalUnit navalUnit = battleUnitFactory.createNavalUnit(UnitType.BATTLESHIP);
        log.info(navalUnit);
        assertThat(navalUnit)
                .as("checking battleship")
                .isInstanceOf(Battleship.class);
    }

    /**
     * test if unit is a bomber
     */
    @Test
    void created_bomber_unit_test() {
        AirUnit airUnit = battleUnitFactory.createAirUnit(UnitType.BOMBER);
        log.info(airUnit);
        assertThat(airUnit)
                .as("checking bomber")
                .isInstanceOf(Bomber.class);
    }

    /**
     * test if unit is a destroyer
     */
    @Test
    void created_destroyer_unit_test() {
        assertThat(battleUnitFactory.createNavalUnit(UnitType.DESTROYER))
                .as("checking destroyer")
                .isInstanceOf(Destroyer.class);
    }

    /**
     * test if unit is a modern armor
     */
    @Test
    void created_modern_armor_unit_test() {
        assertThat(battleUnitFactory.createArmoredUnit(UnitType.MODERN_ARMOR))
                .as("checking modern armor")
                .isInstanceOf(ModernArmor.class);
    }

    /**
     * test if unit is a rifleman
     */
    @Test
    void created_infantry_unit_test() {
        assertThat(battleUnitFactory.createInfantryUnit(UnitType.RIFLEMAN))
                .as("checking infantry")
                .isInstanceOf(Rifleman.class);
    }

    /**
     * test if unit is a rocker artillery
     */
    @Test
    void created_rocket_artillery_unit_test() {
        assertThat(battleUnitFactory.createArtilleryUnit(UnitType.ROCKET_ARTILLERY))
                .as("checking rocket artillery")
                .isInstanceOf(RocketArtillery.class);
    }

    /**
     * test if unit is a stealth bomber
     */
    @Test
    void created_stealth_bomber_unit_test() {
        assertThat(battleUnitFactory.createAirUnit(UnitType.STEALTH_BOMBER))
                .as("checking stealth bomber")
                .isInstanceOf(StealthBomber.class);
    }

    /**
     * test if unit is a tank
     */
    @Test
    void created_tank_unit_test() {
        assertThat(battleUnitFactory.createArmoredUnit(UnitType.TANK))
                .as("checking tank")
                .isInstanceOf(Tank.class);
    }
}
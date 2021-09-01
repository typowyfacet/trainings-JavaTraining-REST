package building;

import enums.Materials;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static enums.Materials.GLASS;

public abstract class House {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private Materials pillars = buildPillars();
    private Materials walls = buildWalls();
    private Materials windows = GLASS;
    private Materials roof = buildRoof();

    public final void buildHouse() {
        logger.info("Pillars are made of {}.", pillars.getMaterial());
        logger.info("Walls are made of {}.", walls.getMaterial());
        logger.info("Windows are made of {}.", windows.getMaterial());
        logger.info("Roof is made of {}.", roof.getMaterial());
    }

    abstract Materials buildWalls();

    abstract Materials buildPillars();

    abstract Materials buildRoof();

    public Materials getPillars() {
        return pillars;
    }

    public Materials getWalls() {
        return walls;
    }

    public Materials getWindows() {
        return windows;
    }

    public Materials getRoof() {
        return roof;
    }
}

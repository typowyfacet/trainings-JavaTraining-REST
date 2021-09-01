package factory;

import enums.UnitType;
import units.*;

public abstract class Factory {
    abstract public InfantryUnit createInfantryUnit(UnitType unitType);

    abstract public ArmoredUnit createArmoredUnit(UnitType unitType);

    abstract public ArtilleryUnit createArtilleryUnit(UnitType unitType);

    abstract public NavalUnit createNavalUnit(UnitType unitType);

    abstract public AirUnit createAirUnit(UnitType unitType);
}

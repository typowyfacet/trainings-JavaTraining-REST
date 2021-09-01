package provider;

import enums.UnitType;

public abstract class Factory {
    abstract public Unit createUnit(UnitType unitType);
}
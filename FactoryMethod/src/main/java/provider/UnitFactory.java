package provider;

import enums.UnitType;

import static conf.Conf.*;

public class UnitFactory extends Factory {
    @Override
    public Unit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(TANK_HP.getValue(), TANK_EXP.getValue(), TANK_DAMAGE.getValue());
            case RIFLEMAN:
                return new Rifleman(RIFLEMAN_HP.getValue(), RIFLEMAN_EXP.getValue(), RIFLEMAN_DAMAGE.getValue());
            default:
                throw new UnsupportedOperationException("No such unit type");
        }
    }
}
package enums;

public enum Sauce {

    TOMATO("Tomato"),
    SPICY("Spicy"),
    SWEET("Sweet"),
    BBQ("BBQ"),
    PESTO("Pesto"),
    HEAVY_BASIL("Heavy Basil");

    private String name;

    Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

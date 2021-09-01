package enums;

public enum Dough {

    SUPER_THICK("Super thick"),
    THICK("Thick"),
    SUPER_FLUFFY("Super fluffy");

    private String name;

    Dough(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
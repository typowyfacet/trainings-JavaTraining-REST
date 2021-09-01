package enums;

public enum Materials {

    WOOD("wood"),
    PLATE("plate"),
    CLAY("clay"),
    GLASS("glass"),
    BRICK("brick"),
    COBBLESTONE("cobblestone");

    Materials(String material) {
        this.material = material;
    }

    String material;

    public String getMaterial() {
        return material;
    }
}

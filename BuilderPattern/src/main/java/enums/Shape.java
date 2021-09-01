package enums;

public enum Shape {

    RECTANGLE("rectangle"),
    ROUND("round");

    private String name;

    Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

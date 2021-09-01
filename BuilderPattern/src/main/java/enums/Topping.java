package enums;

public enum Topping {

    SAUSAGE("Sausage"),
    ONION("Onion"),
    PEPPERONI_HAM("Pepperoni Ham"),
    PEPPERONI("Pepperoni"),
    CHEESE("Cheese"),
    PINEAPPLE("Pineapple"),
    HAM("Ham");

    private String name;

    Topping(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

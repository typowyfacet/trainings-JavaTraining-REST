package utilities;

public enum Connector {

    LIGHTNINGTOMICROUSBADAPTER("Lightning to MicroUSB adapter"),
    LIGHTNING("Lightning connector"),
    MICROUSB("MicroUSB connector");

    private String name;

    Connector(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

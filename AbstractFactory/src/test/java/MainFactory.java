import factory.Factory;


public class MainFactory {
    private final Factory factory;

    public MainFactory(Factory factory) {
        this.factory = factory;
    }

    public Factory getFactory() {
        return factory;
    }
}

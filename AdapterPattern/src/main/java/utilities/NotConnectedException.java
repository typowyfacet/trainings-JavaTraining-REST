package utilities;

public class NotConnectedException extends Exception {

    public NotConnectedException(Connector connector) {
        super(connector.getName() + " not connected.");
    }
}

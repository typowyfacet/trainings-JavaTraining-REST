package charge;

import utilities.NotConnectedException;

public interface LightningConnector {

    void recharge() throws NotConnectedException;

    void useLightning();

    boolean isConnected();
}

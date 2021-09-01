package charge;

import utilities.NotConnectedException;

public interface MicroUSBConnector {

    void recharge() throws NotConnectedException;

    void useMicroUSB();

    boolean isConnected();
}

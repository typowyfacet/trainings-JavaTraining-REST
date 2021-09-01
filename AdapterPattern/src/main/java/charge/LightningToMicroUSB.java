package charge;

import utilities.NotConnectedException;

/**
 * Target
 */

public interface LightningToMicroUSB {

    void recharge() throws NotConnectedException;

    void useMicroUSB();

    boolean isConnected();
}

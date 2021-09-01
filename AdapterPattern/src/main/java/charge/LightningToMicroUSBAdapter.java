package charge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.NotConnectedException;

import static utilities.Connector.LIGHTNINGTOMICROUSBADAPTER;

/**
 * Adapter
 */

public class LightningToMicroUSBAdapter implements LightningToMicroUSB {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private LightningDevice lightningDevice;
    private boolean connected = false;

    public LightningToMicroUSBAdapter(LightningDevice lightningDevice) {
        this.lightningDevice = lightningDevice;
    }

    @Override
    public void recharge() throws NotConnectedException {
        if (connected) {
            lightningDevice.useLightning();
            lightningDevice.recharge();
            connected = false;
            logger.info("MicroUSB adapter disconnected");
        } else {
            throw new NotConnectedException(LIGHTNINGTOMICROUSBADAPTER);
        }
    }

    @Override
    public void useMicroUSB() {
        connected = true;
        logger.info("MicroUSB adapter connected");
    }

    public boolean isConnected() {
        return connected;
    }
}

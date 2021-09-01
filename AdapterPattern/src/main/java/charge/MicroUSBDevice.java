package charge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.NotConnectedException;

import static utilities.Connector.MICROUSB;

/**
 * Adaptee
 */

public class MicroUSBDevice implements MicroUSBConnector {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private boolean connected = false;

    @Override
    public void recharge() throws NotConnectedException {
        if (connected) {
            logger.info("Charging started");
            logger.info("Charging ended");
            connected = false;
            logger.info("MicroUSB disconnected from device");
        } else {
            throw new NotConnectedException(MICROUSB);
        }
    }

    @Override
    public void useMicroUSB() {
        connected = true;
        logger.info("MicroUSB connected to device");
    }

    public boolean isConnected() {
        return connected;
    }
}

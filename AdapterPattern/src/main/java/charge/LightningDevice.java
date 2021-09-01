package charge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utilities.NotConnectedException;

import static utilities.Connector.LIGHTNING;


public class LightningDevice implements LightningConnector {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private boolean connected = false;

    @Override
    public void recharge() throws NotConnectedException {
        if (connected) {
            logger.info("Charging started");
            logger.info("Charging ended");
            connected = false;
            logger.info("Lightning disconnected from device");
        } else {
            throw new NotConnectedException(LIGHTNING);
        }
    }

    @Override
    public void useLightning() {
        connected = true;
        logger.info("Lightning connected to device");
    }

    public boolean isConnected() {
        return connected;
    }
}

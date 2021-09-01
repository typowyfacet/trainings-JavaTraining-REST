package chargingtest;

import charge.LightningDevice;
import charge.LightningToMicroUSB;
import charge.LightningToMicroUSBAdapter;
import charge.MicroUSBDevice;
import org.junit.jupiter.api.Test;
import utilities.NotConnectedException;

import static org.assertj.core.api.Assertions.assertThat;
import static utilities.Connector.LIGHTNING;
import static utilities.Connector.MICROUSB;
import static utilities.Connector.LIGHTNINGTOMICROUSBADAPTER;

/**
 * methods getMessage(), getCause(), getClass() provides option
 * to compare exception in try catch blocks to test
 * if exception is correctly thrown
 */

public class testTryCatchChargingException {

    @Test
    public void lightningExceptionTryCatchTest() {
        LightningDevice lightningDevice = new LightningDevice();
        try {
            lightningDevice.recharge();
        } catch (NotConnectedException exception) {
            assertThat(exception.getMessage()).isEqualTo(new NotConnectedException(LIGHTNING).getMessage());
            assertThat(exception.getCause()).isEqualTo(new NotConnectedException(LIGHTNING).getCause());
            assertThat(exception.getClass()).isEqualTo(NotConnectedException.class);
        }
    }

    @Test
    public void microUSBExceptionTryCatchTest() {
        MicroUSBDevice microUSBDevice = new MicroUSBDevice();
        try {
            microUSBDevice.recharge();
        } catch (NotConnectedException exception) {
            assertThat(exception.getMessage()).isEqualTo(new NotConnectedException(MICROUSB).getMessage());
            assertThat(exception.getCause()).isEqualTo(new NotConnectedException(MICROUSB).getCause());
            assertThat(exception.getClass()).isEqualTo(NotConnectedException.class);
        }
    }

    @Test
    public void adapterExceptionTryCatchTest() {
        LightningDevice lightningDevice = new LightningDevice();
        LightningToMicroUSB lightningToMicroUSB = new LightningToMicroUSBAdapter(lightningDevice);
        try {
            lightningToMicroUSB.recharge();
        } catch (NotConnectedException exception) {
            assertThat(exception.getMessage()).isEqualTo(new NotConnectedException(LIGHTNINGTOMICROUSBADAPTER).getMessage());
            assertThat(exception.getCause()).isEqualTo(new NotConnectedException(LIGHTNINGTOMICROUSBADAPTER).getCause());
            assertThat(exception.getClass()).isEqualTo(NotConnectedException.class);
        }
    }
}

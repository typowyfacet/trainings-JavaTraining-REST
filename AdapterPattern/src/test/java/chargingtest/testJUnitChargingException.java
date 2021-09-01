package chargingtest;

import charge.LightningDevice;
import charge.LightningToMicroUSB;
import charge.LightningToMicroUSBAdapter;
import charge.MicroUSBDevice;
import org.junit.jupiter.api.Test;
import utilities.NotConnectedException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class testJUnitChargingException {

    @Test
    public void lightningExceptionJUnitTest() {
        LightningDevice lightningDevice = new LightningDevice();
        assertThrows(NotConnectedException.class, lightningDevice::recharge);
    }

    @Test
    public void microUSBExceptionJUnitTest() {
        MicroUSBDevice microUSBDevice = new MicroUSBDevice();
        assertThrows(NotConnectedException.class, microUSBDevice::recharge);
    }

    @Test
    public void adapterExceptionJUnitTest() {
        LightningDevice lightningDevice = new LightningDevice();
        LightningToMicroUSB lightningToMicroUSB = new LightningToMicroUSBAdapter(lightningDevice);
        assertThrows(NotConnectedException.class, lightningToMicroUSB::recharge);
    }
}

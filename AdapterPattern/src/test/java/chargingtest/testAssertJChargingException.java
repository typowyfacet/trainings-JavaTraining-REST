package chargingtest;

import charge.LightningDevice;
import charge.LightningToMicroUSB;
import charge.LightningToMicroUSBAdapter;
import charge.MicroUSBDevice;
import org.junit.jupiter.api.Test;
import utilities.NotConnectedException;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class testAssertJChargingException {

    @Test
    void lightningExceptionAssertJTest() {
        LightningDevice lightningDevice = new LightningDevice();
        assertThatExceptionOfType(NotConnectedException.class).isThrownBy(lightningDevice::recharge);
    }

    @Test
    void microUSBExceptionAssertJTest() {
        MicroUSBDevice microUSBDevice = new MicroUSBDevice();
        assertThatExceptionOfType(NotConnectedException.class).isThrownBy(microUSBDevice::recharge);
    }

    @Test
    void adapterExceptionAssertJTest() {
        LightningDevice lightningDevice = new LightningDevice();
        LightningToMicroUSB lightningToMicroUSB = new LightningToMicroUSBAdapter(lightningDevice);
        assertThatExceptionOfType(NotConnectedException.class).isThrownBy(lightningToMicroUSB::recharge);
    }
}

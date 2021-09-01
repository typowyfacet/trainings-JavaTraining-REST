package chargingtest;

import charge.LightningDevice;
import charge.LightningToMicroUSBAdapter;
import charge.LightningToMicroUSB;
import charge.MicroUSBDevice;
import org.junit.jupiter.api.Test;
import utilities.NotConnectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class testChargingDevices {

    @Test
    public void lightningDeviceTest() throws NotConnectedException {
        LightningDevice lightningDevice = new LightningDevice();
        lightningDevice.useLightning();
        assertThat(lightningDevice.isConnected()).isTrue();
        lightningDevice.recharge();
        assertThat(lightningDevice.isConnected()).isFalse();
    }

    @Test
    public void microUSBDeviceTest() throws NotConnectedException {
        MicroUSBDevice microUSBDevice = new MicroUSBDevice();
        microUSBDevice.useMicroUSB();
        assertThat(microUSBDevice.isConnected()).isTrue();
        microUSBDevice.recharge();
        assertThat(microUSBDevice.isConnected()).isFalse();
    }

    @Test
    public void adapterLightningToMicroUSBTest() throws NotConnectedException {
        LightningDevice lightningDevice = new LightningDevice();
        LightningToMicroUSB adapter = new LightningToMicroUSBAdapter(lightningDevice);
        adapter.useMicroUSB();
        assertThat(adapter.isConnected()).isTrue();
        adapter.recharge();
        assertThat(adapter.isConnected()).isFalse();
    }
}

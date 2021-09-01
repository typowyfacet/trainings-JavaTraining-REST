package remotecontrollertests;

import lightcontrol.Light;
import lightcontrol.RemoteController;
import lightcontrol.commands.LightBrightnessDownCommand;
import lightcontrol.commands.LightBrightnessUpCommand;
import lightcontrol.commands.LightOffCommand;
import lightcontrol.commands.LightOnCommand;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static lightcontrol.enums.Status.OFF;
import static lightcontrol.enums.Status.ON;

public class RemoteControllerOnOffTest {

    @Test
    public void onOffTest() {
        Light light = new Light();
        RemoteController remoteController = new RemoteController(
                new LightOnCommand(light),
                new LightOffCommand(light),
                new LightBrightnessUpCommand(light),
                new LightBrightnessDownCommand(light)
        );
        remoteController.clickOn();
        assertThat(light.getStatus()).isEqualByComparingTo(ON);
        remoteController.clickOff();
        assertThat(light.getStatus()).isEqualByComparingTo(OFF);
    }
}

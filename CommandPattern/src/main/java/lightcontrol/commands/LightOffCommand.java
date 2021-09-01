package lightcontrol.commands;

import lightcontrol.Light;
import lightcontrol.enums.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static lightcontrol.enums.Status.ON;
import static lightcontrol.enums.Status.OFF;

public class LightOffCommand implements Command {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light.getStatus().equals(ON)) {
            light.setStatus(OFF);
            logger.info("Turning off the light");
        } else {
            logger.info("Light is OFF | can't turn off");
        }
    }
}

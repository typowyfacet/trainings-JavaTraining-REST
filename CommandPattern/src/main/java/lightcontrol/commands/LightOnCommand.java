package lightcontrol.commands;

import lightcontrol.Light;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static lightcontrol.enums.Status.OFF;
import static lightcontrol.enums.Status.ON;

public class LightOnCommand implements Command {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        if (light.getStatus().equals(OFF)) {
            light.setStatus(ON);
            logger.info("Turning on the light");
        } else {
            logger.info("Light is {} | can't turn on", light.getStatus().toString());
        }
    }
}

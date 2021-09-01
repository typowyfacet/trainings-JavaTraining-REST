package lightcontrol;

import lightcontrol.enums.Status;
import lightcontrol.utilities.IncorrectBrightnessException;

import static lightcontrol.enums.Status.ON;
import static lightcontrol.enums.Status.OFF;

public class Light {

    private int brightness = 100;
    private Status status = OFF;

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) throws IncorrectBrightnessException {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            throw new IncorrectBrightnessException();
        }
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

package lightcontrol;

import lightcontrol.commands.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;

public class RemoteController {

    private Command on;
    private Command off;
    private Command up;
    private Command down;

    public RemoteController(Command on, Command off, Command up, Command down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public RemoteController clickOn() {
        on.execute();
        return this;
    }

    public RemoteController clickOff() {
        off.execute();
        return this;
    }

    public RemoteController clickUp() {
        up.execute();
        return this;
    }

    public RemoteController clickDown() {
        down.execute();
        return this;
    }
}

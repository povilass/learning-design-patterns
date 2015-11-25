package module.command.version1.modals;

import module.command.Command;

/**
 * Created by Povka on 11/10/2015.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }
}

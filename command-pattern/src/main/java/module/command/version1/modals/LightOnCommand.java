package module.command.version1.modals;

import module.command.Command;

/**
 * Created by Povka on 11/3/2015.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
    }
}

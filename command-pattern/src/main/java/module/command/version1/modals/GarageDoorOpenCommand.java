package module.command.version1.modals;

import module.command.Command;

/**
 * Created by Povka on 11/3/2015.
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        this.garageDoor.up();
    }
}

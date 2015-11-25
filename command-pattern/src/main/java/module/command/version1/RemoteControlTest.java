package module.command.version1;

import module.command.version1.modals.GarageDoor;
import module.command.version1.modals.GarageDoorOpenCommand;
import module.command.version1.modals.Light;
import module.command.version1.modals.LightOnCommand;

/**
 * Created by Povka on 11/3/2015.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(door);


        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(doorOpenCommand);
        remote.buttonWasPressed();

    }
}

package module.command.version4;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        this.hottub.setTemperature(98);
        this.hottub.off();
    }

    public void undo() {
        this.hottub.on();
    }
}
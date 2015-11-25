package module.command.version4;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.off();
    }

    public void undo() {
        this.tv.on();
    }
}

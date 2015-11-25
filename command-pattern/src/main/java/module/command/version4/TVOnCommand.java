package module.command.version4;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.on();
        this.tv.setInputChannel();
    }

    public void undo() {
        this.tv.off();
    }
}
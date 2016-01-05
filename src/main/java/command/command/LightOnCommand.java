package command.command;

import command.receiver.Light;

/**
 * Created by wukong on 15-12-29.
 */
public class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}

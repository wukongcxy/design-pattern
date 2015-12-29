package command;

import command.command.Command;
import command.command.LightOffCommand;
import command.command.LightOnCommand;
import command.receiver.Light;

/**
 * Created by wukong on 15-12-29.
 */
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, lightOnCommand, lightOffCommand);
        remoteControl.pressOn(1);
        remoteControl.pressOff(1);
        remoteControl.undo();
    }
}

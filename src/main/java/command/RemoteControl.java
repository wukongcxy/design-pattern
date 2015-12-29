package command;

import command.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wukong on 15-12-29.
 */
public class RemoteControl {
    private List<Command> onCommands;
    private List<Command> offCommands;
    private Command lastCommand;

    public RemoteControl() {
        this.onCommands = new ArrayList<Command>();
        this.offCommands = new ArrayList<Command>();
    }

    public void setCommand(Integer index, Command onCommand, Command offCommand) {
        onCommands.add(index, onCommand);
        offCommands.add(index, offCommand);
    }

    public void pressOn(Integer index) {
        onCommands.get(index).execute();
        lastCommand = onCommands.get(index);
    }

    public void pressOff(Integer index) {
        offCommands.get(index).execute();
        lastCommand = offCommands.get(index);
    }

    public void undo() {
        lastCommand.undo();
    }

}

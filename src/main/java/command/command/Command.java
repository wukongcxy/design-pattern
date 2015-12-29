package command.command;

/**
 * Created by wukong on 15-12-29.
 */
public interface Command {
    void execute();
    void undo();
}

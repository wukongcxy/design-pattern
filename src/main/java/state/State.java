package state;

/**
 * Created by chenxinyue on 2016/1/7.
 */
public abstract class State {
    private GumballMachine gumballMachine;

    public State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public abstract void insertQuarter();

    public abstract void ejectQuarter();

    public abstract void turnCrank();

    public abstract void dispense();

    protected GumballMachine getGumballMachine() {
        return this.gumballMachine;
    }

    public abstract void printState();

}

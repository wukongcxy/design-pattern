package state;

/**
 * Created by chenxinyue on 2016/1/7.
 */
public class NoQuarterState extends State {
    public NoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override public void insertQuarter() {
        System.out.println("insert Quarter!");
        getGumballMachine().setState(new HasQuarterState(getGumballMachine()));
    }

    @Override public void ejectQuarter() {
        throw new UnsupportedOperationException();
    }

    @Override public void turnCrank() {
        throw new UnsupportedOperationException();
    }

    @Override public void dispense() {
        throw new UnsupportedOperationException();
    }

    @Override public void printState() {
        System.out.println("NoQuarterState");
    }
}

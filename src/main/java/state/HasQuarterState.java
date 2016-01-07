package state;

/**
 * Created by chenxinyue on 2016/1/7.
 */
public class HasQuarterState extends State {
    public HasQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override public void insertQuarter() {
        throw new UnsupportedOperationException();
    }

    @Override public void ejectQuarter() {
        System.out.println("eject quarter");
        getGumballMachine().setState(new NoQuarterState(getGumballMachine()));
    }

    @Override public void turnCrank() {
        System.out.println("turn crank");
        getGumballMachine().setState(new SoldState(getGumballMachine()));
    }

    @Override public void dispense() {
        throw new UnsupportedOperationException();
    }

    @Override public void printState() {
        System.out.println("HasQuarterState");
    }
}

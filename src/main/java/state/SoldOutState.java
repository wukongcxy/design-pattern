package state;

/**
 * Created by chenxinyue on 2016/1/7.
 */
public class SoldOutState extends State {

    public SoldOutState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override public void insertQuarter() {
        throw new UnsupportedOperationException();
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
        System.out.println("SoldOutState");
    }
}

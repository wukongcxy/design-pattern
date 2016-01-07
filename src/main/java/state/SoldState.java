package state;

/**
 * Created by chenxinyue on 2016/1/7.
 */
public class SoldState extends State {
    public SoldState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    @Override
    public void insertQuarter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void ejectQuarter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void turnCrank() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void dispense() {
        System.out.println("dispense gumball");
        Integer count = getGumballMachine().getCount();
        if (count > 0) {
            System.out.println("dispense gumball");
            getGumballMachine().setCount(--count);
            if (count == 0) {

                getGumballMachine().setState(new SoldOutState(getGumballMachine()));
            } else {
                getGumballMachine().setState(new NoQuarterState(getGumballMachine()));
            }

        } else {
            throw new UnsupportedOperationException();
        }

    }

    @Override public void printState() {
        System.out.println("SoldState");
    }

}

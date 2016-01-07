package state;

/**
 * Created by chenxinyue on 2016/1/7.
 */
public class GumballMachine {
    private State state = new NoQuarterState(this);
    private Integer count = 10;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
    }

    public void dispense() {
        this.state.dispense();
    }
}

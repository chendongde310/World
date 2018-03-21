package war3.online.base;

public class StateBuilder {
    private int defaultState = 0;
    private int solidPoint = 0;
    private int airPoint = 100;

    public StateBuilder setDefaultState(int defaultState) {
        this.defaultState = defaultState;
        return this;
    }

    public StateBuilder setSolidPoint(int solidPoint) {
        this.solidPoint = solidPoint;
        return this;
    }

    public StateBuilder setAirPoint(int airPoint) {
        this.airPoint = airPoint;
        return this;
    }

    public State createState() {
        return new State(defaultState, solidPoint, airPoint);
    }
}
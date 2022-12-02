package strategy;

public class UseStrategy {

    private Strategy strategy;

    public UseStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        this.strategy.execute();
    }
}

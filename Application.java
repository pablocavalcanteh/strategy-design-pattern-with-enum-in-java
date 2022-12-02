package strategy;

public class Application {

    public static void main(String[] args) {

        UseStrategy useStrategyA = new UseStrategy(Strategy.STRATEGY_A);
        useStrategyA.executeStrategy();

        UseStrategy useStrategyB = new UseStrategy(Strategy.STRATEGY_B);
        useStrategyB.executeStrategy();
    }
}

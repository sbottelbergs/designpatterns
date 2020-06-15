package behavioural.strategy.strategy;

/**
 * An offensive strategy.
 */
public class OffensiveStrategy implements Strategy {
    /**
     * {@inheritDoc}
     */
    @Override
    public void performStrategy() {
        System.out.println("Offensive Strategy");
    }
}

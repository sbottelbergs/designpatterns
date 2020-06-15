package behavioural.strategy.strategy;

/**
 * A defensive strategy.
 */
public class DefensiveStrategy implements Strategy {
    /**
     * {@inheritDoc}
     */
    @Override
    public void performStrategy() {
        System.out.println("Defensive Strategy");
    }
}

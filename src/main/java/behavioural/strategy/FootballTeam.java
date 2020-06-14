package behavioural.strategy;

/**
 * Klasse die een voetbalploeg voorstelt.
 *
 * Het team gebruikt de strategie die wordt opgelegd door de coach.
 */
public class FootballTeam {
    private Strategy strategy;

    public FootballTeam(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Bepaal de strategie.
     *
     * @param strategy de strategie.
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Methode om de ploeg te laten spelen met de vooraf bepaalde strategie.
     */
    public void play() {
        System.out.println("Playing football with strategy: ");
        strategy.performStrategy();
    }
}

package behavioural.strategy;

import behavioural.strategy.strategy.DefensiveStrategy;
import behavioural.strategy.strategy.FootballTeam;
import behavioural.strategy.strategy.OffensiveStrategy;

/**
 * Het strategy patroon zorgt ervoor dat een klasse at runtime van manier van werken kan veranderen, door het
 * toepassen van een andere strategie. In het onderstaande voorbeeld probeer ik dit te schetsen aan de hand van een
 * voetbalwedstrijd.
 */
public class StrategyExample {
    public static void main(String[] args) {
        FootballTeam footballTeam = new FootballTeam(new OffensiveStrategy());
        // Eerste helft
        footballTeam.play();
        /* Output:
         * Playing football with strategy:
         * Offensive Strategy
         */

        // Rust (stand bij rust: 2-0)
        // De coach is tevreden met het resultaat tot dusver en verandert voor de tweede helft van strategie
        footballTeam.setStrategy(new DefensiveStrategy());

        // Tweede helft
        footballTeam.play();
        /* Output:
         * Playing football with strategy:
         * Defensive Strategy
         */
    }
}

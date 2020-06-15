package behavioural.state.state;

/**
 * De state machine die intern een referentie bijhoudt naar de huidige state en er vervolgens operaties op uitvoert.
 * Dit is vergelijkbaar met het {@link behavioural.strategy.strategy.Strategy} patroon, maar een belangrijk verschil
 * is dat hier de verschillende {@link State} nodes zelf bepalen wanneer deze {@link StateContext} in een andere
 * toestand terecht komt.
 */
public class StateContext {
    private State state;

    public StateContext() {
        state = new LowercaseState();
    }

    /**
     * Publieke methode om de huidige state aan te passen.
     *
     * @param state de nieuwe state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Deze methode dient als proxy voor de effectieve methode op de huidige state.
     * We geven hier telkens een referentie van onszelf mee, en de naam die we willen schrijven.
     *
     * @param name de naam die we willen wegschrijven op de console
     */
    public void writeName(String name) {
        this.state.writeName(this, name);
    }
}

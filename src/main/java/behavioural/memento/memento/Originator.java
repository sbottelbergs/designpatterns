package behavioural.memento.memento;

/**
 * Klasse waarvan we de state changes willen bijhouden in de vorm van {@link Memento}s.
 */
public class Originator {
    private String state;

    /**
     * Methode om de state te zetten.
     *
     * @param state de nieuwe state
     */
    public void setState(String state){
        this.state = state;
    }

    /**
     * Methode om de huidige state op te halen
     *
     * @return de huidige state
     */
    public String getState(){
        return state;
    }

    /**
     * Methode om eem {@link Memento} aan te maken die de huidige state voorstelt.
     *
     * @return een Memento die de huidige state voorstelt
     */
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    /**
     * Methode om de huidige state te herstellen vanuit een eerder opgeslagen {@link Memento}
     *
     * @param memento de Memento waarmee we de huidige state herstellen
     */
    public void restoreStateFromMemento(Memento memento){
        state = memento.getSavedState();
    }
}

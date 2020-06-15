package behavioural.memento.memento;

/**
 * Immutable Memento klasse. Bevat een snapshot van de state op een bepaald moment, en kan niet gewijzigd worden.
 */
public class Memento {
    private String savedState;

    public Memento(String savedState) {
        this.savedState = savedState;
    }

    public String getSavedState() {
        return savedState;
    }
}

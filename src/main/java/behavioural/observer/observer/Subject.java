package behavioural.observer.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * Het Subject dat een lijst van Observers bevat die geïnteresseerd zijn in updates.
 */
public class Subject {
    private String internalState;
    private Set<Observer> observers;

    /**
     * Methode om een Observer te laten registreren voor updates.
     *
     * @param observer de Observer
     */
    public void addObserver(Observer observer) {
        if (this.observers == null) {
            this.observers = new HashSet<>();
        }
        this.observers.add(observer);
    }

    /**
     * Methode om een Observer te laten onregistreren voor updates.
     *
     * @param observer de Observer
     */
    public void removeObserver(Observer observer) {
        if (this.observers != null) {
            this.observers.remove(observer);
        }
    }

    /**
     * Methode om de interne state van het Subject te wijzigen.
     *
     * @param state de nieuwe state
     */
    public void updateState(String state) {
        this.internalState = state;
        this.notifyObservers();
    }

    private void notifyObservers() {
        observers.forEach(observer -> observer.update(this.internalState));
    }
}

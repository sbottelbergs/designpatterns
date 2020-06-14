package behavioural.observer;

/**
 * Interface voor de Observer.
 */
public interface Observer {
    /**
     * Methode die wordt aangeroepen wanneer we op de hoogte gebracht worden van een update in de state van ons Subject.
     *
     * @param data de data die geüpdatet werd
     */
    void update(String data);
}

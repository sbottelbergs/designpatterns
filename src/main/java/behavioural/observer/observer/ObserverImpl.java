package behavioural.observer.observer;

/**
 * Implementatie van een Observer.
 */
public class ObserverImpl implements Observer {
    /**
     * {@inheritDoc}
     */
    @Override
    public void update(String data) {
        System.out.println("Notified observer: " + data);
    }
}

package behavioural.observer;

import behavioural.observer.observer.Observer;
import behavioural.observer.observer.ObserverImpl;
import behavioural.observer.observer.Subject;

/**
 * Het Observer patroon is een patroon waarbij we werken met 2 types van objecten: Observers en Subjects.
 * Een Subject is een object dat zijn Observers op de hoogte brengt van veranderingen in zijn interne state.
 */
public class ObserverExample {
    public static void main(String[] args) {
        // Maak een Subject aan
        final Subject subject = new Subject();

        // Maak een Observer aan
        final Observer observer = new ObserverImpl();

        // Registreer Observer bij Subject
        subject.addObserver(observer);

        // Update Subject
        subject.updateState("updated");

        /* Output:
         * Observer notified: updated
         */

        // Onregistreer Observer bij Subject
        subject.removeObserver(observer);

        // Update Subject
        subject.updateState("updated again");
        /* Output: (geen output)
         */
    }
}

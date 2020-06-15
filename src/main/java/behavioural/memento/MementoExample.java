package behavioural.memento;

import behavioural.memento.memento.Caretaker;
import behavioural.memento.memento.Originator;

/**
 * Het Memento patroon wordt vaak gebruikt voor undo/redo functionaliteit. Dit patroon bestaat uit een aantal
 * gerelateerde componenten:
 * - Originator: het object waarvan we de state willen kunnen opslaan en herstellen
 * - Caretaker: het object dat een verzameling van state snapshots bijhoudt
 * - Memento: een immutable object dat de state van de Originator op een bepaald moment bijhoudt
 *
 * We houden niet instanties van de Originator bij, maar snapshots van de state op verschillende momenten in de tijd.
 * De Originator weet zelf hoe het zijn state moet opslaan in een Memento, en kan ook zijn state heropbouwen aan de
 * hand van een eerder opgeslagen Memento
 */
public class MementoExample {
    public static void main(String[] args) {
        // We maken een instantie van de Originator en Caretake
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        /* We zetten de eerste state op de Originator en vragen een snapshot van de huidige state
         * in de vorm van een Memento. Dit Memento geven we aan de Caretaker om op te slaan.
         */
        originator.setState("State 0");
        caretaker.add(originator.saveStateToMemento());
        System.out.println("Originator state: " + originator.getState());

        /* We zetten een nieuwe state op de Originator en vragen opnieuw een snapshot van de huidige state.
         * Opnieuw geven we het Memento aan de Caretaker om op te slaan.
         */
        originator.setState("State 1");
        caretaker.add(originator.saveStateToMemento());
        System.out.println("Originator state: " + originator.getState());

        /* We gaan nu de originele state opnieuw opbouwen door de eerste opgeslagen state te vragen aan de caretaker.
         * Deze geeft het Memento terug dat de originele state voorstelt. Dit Memento geven we aan de Originator,
         * die op zijn beurt de originele state opnieuw opbouwt.
         */
        originator.restoreStateFromMemento(caretaker.get(0));
        System.out.println("Originator state: " + originator.getState());
    }
}

package behavioural.state;

import behavioural.state.state.StateContext;

/**
 * Het State patroon ligt conceptueel dichtbij het idee van een state machine. Het systeem bevindt zich in een bepaalde
 * state, en vanuit iedere state kan er naar een bepaalde andere state gesprongen worden.
 *
 * In het voorbeeld hier (geript van het Wikipedia artikel: https://en.wikipedia.org/wiki/State_pattern) hebben we een
 * bepaalde state machine {@link StateContext}, die intern een referentie bijhoudt naar de huidige state. In het simpele
 * voorbeeld dat we hier demonstreren printen we telkens de dagen van de week ofwel in kleine letters, ofwel in
 * hoofdletters, afhankelijk van de interne state van de state machine.
 *
 * Het is aan de state zelf om de state machine naar een andere State te brengen. De state machine zelf bevat hiervoor
 * geen logica.
 *
 * Dit patroon wordt in game design bv gebruikt voor het autonome gedrag van NPCs. Deze characters hebben een aantal
 * states waar ze zich in kunnen bevinden: idle, yawning, searching, hiding, walking, harvesting... en afhankelijk van
 * bepaalde condities bevinden ze zich in een bepaalde state. Indien een character bijvoorbeeld 15 seconden in de "idle"
 * state zit, zal hij automatisch overgaan naar "yawning" en vervolgens terug gaan naar "idle". Deze overgangen zijn
 * onderdeel van de logica van de specifieke state zelf, en dus niet van de state machine.
 */
public class StateExample {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        context.writeName("Monday");
        context.writeName("Tuesday");
        context.writeName("Wednesday");
        context.writeName("Thursday");
        context.writeName("Friday");
        context.writeName("Saturday");
        context.writeName("Sunday");
        /* Output:
         * monday
         * TUESDAY
         * WEDNESDAY
         * thursday
         * FRIDAY
         * SATURDAY
         * sunday
         */
    }
}

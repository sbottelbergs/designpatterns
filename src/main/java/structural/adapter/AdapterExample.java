package structural.adapter;

import structural.adapter.model.*;

/**
 * Het Adapter patroon dient om ervoor te zorgen dat we twee interfaces die normaal gesproken incompatibel
 * zijn met elkaar, toch uitwisselbaar kunnen gebruiken. Denk bijvoorbeeld aan de stroomadapter die je op reis gebruikt
 * om jouw GSM op te laden met een twee-pin Europese oplader in een 3-pin stopcontact.
 *
 * We schrijven een soort wrapper rond de incompatibele klasse (of interface) en doen een soort vertaalslag
 * van de ene operatie naar de andere.
 */
public class AdapterExample {
    public static void main(String[] args) {
        // We hebben een twee-pin oplaadkabel
        TwoProngPlug twoProngPlug = new TwoProngChargingCable();

        // We hebben een 3-pin stopcontact
        final ThreeProngPowerOutlet powerOutlet = new ThreeProngPowerOutlet();

        // powerOutlet.plugin(twoProngPlug) gaat niet wegens incompatibele interfaces

        // We nemen onze adapter erbij
        final TwoToThreeProngAdapter adapter = new TwoToThreeProngAdapter(twoProngPlug);

        // We pluggen onze adapter in het stopcontact en laten de stroom vloeien.
        powerOutlet.plugIn(adapter);

        // We trekken de stekker er terug uit
        powerOutlet.unplug();

        /* Output:
         * Three Prong Power Outlet Giving Power
         * Using Two Prong Charging Cable
         * Disconnected
         */
    }
}

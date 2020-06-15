package structural.adapter.model;

/**
 * Representatie van een 2-pin oplaadkabel.
 */
public class TwoProngChargingCable implements TwoProngPlug {
    @Override
    public void useTwoProngPlug() {
        System.out.println("Using Two Prong Charging Cable");
    }
}

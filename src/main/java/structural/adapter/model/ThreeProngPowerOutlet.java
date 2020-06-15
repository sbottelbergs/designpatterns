package structural.adapter.model;

/**
 * Een representatie van een 3-pin stopcontact.
 */
public class ThreeProngPowerOutlet implements PowerOutlet {
    ThreeProngPlug plug;

    /**
     * {@inheritDoc}
     */
    @Override
    public void givePower() {
        if (plug != null) {
            System.out.println("Three Prong Power Outlet Giving Power");
            plug.useThreeProngPlug();
        }
    }

    /**
     * Steek de 3-pin stekker in het stopcontact.
     *
     * @param plug de 3-pin stekker
     */
    public void plugIn(ThreeProngPlug plug) {
        this.plug = plug;
        this.givePower();
    }

    /**
     * Trek de stekker uit het stopcontact.
     */
    public void unplug() {
        if (plug != null) {
            System.out.println("Disconnected");
            this.plug = null;
        }
    }
}

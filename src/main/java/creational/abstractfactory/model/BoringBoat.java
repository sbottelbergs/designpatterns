package creational.abstractfactory.model;

/**
 * Saai en traag watervoertuig.
 */
public class BoringBoat implements AquaticVehicle {
    /**
     * {@inheritDoc}
     */
    @Override
    public int getSpeed() {
        return 1;
    }
}

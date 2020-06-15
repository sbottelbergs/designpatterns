package creational.abstractfactory.model;

/**
 * Awesome watervoertuig.
 */
public class SpeedBoat implements AquaticVehicle {
    /**
     * {@inheritDoc}
     */
    @Override
    public int getSpeed() {
        return 9001;
    }
}

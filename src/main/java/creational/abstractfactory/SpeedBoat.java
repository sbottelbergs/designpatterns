package creational.abstractfactory;

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

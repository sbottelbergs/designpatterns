package creational.abstractfactory;

/**
 * Saai en typisch landvoertuig.
 */
public class BoringCar implements RoadVehicle {
    /**
     * {@inheritDoc}
     */
    @Override
    public int getNumberOfTires() {
        return 4;
    }
}

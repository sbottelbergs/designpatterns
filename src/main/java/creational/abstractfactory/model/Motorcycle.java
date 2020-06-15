package creational.abstractfactory.model;

/**
 * Awesome wegvoertuig.
 */
public class Motorcycle implements RoadVehicle {
    @Override
    public int getNumberOfTires() {
        return 2;
    }
}

package creational.abstractfactory;

/**
 * Factory voor saaie voertuigen.
 */
public class BoringVehicleFactory implements VehicleFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public AquaticVehicle createAquaticVehicle() {
        return new BoringBoat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoadVehicle createRoadVehicle() {
        return new BoringCar();
    }
}

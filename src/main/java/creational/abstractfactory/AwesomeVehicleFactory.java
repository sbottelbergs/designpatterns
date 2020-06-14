package creational.abstractfactory;

/**
 * Factory voor awesome voertuigen.
 */
public class AwesomeVehicleFactory implements VehicleFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public AquaticVehicle createAquaticVehicle() {
        return new SpeedBoat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoadVehicle createRoadVehicle() {
        return new Motorcycle();
    }
}

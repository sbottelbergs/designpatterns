package creational.abstractfactory.factory;

import creational.abstractfactory.model.AquaticVehicle;
import creational.abstractfactory.model.Motorcycle;
import creational.abstractfactory.model.RoadVehicle;
import creational.abstractfactory.model.SpeedBoat;

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

package creational.abstractfactory.factory;

import creational.abstractfactory.model.AquaticVehicle;
import creational.abstractfactory.model.BoringBoat;
import creational.abstractfactory.model.BoringCar;
import creational.abstractfactory.model.RoadVehicle;

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

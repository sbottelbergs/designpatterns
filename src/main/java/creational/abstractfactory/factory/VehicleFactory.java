package creational.abstractfactory.factory;

import creational.abstractfactory.model.AquaticVehicle;
import creational.abstractfactory.model.RoadVehicle;

/**
 * Interface voor de Factory. Voorziet 2 methodes om telkens een bepaald type van voertuig aan te maken.
 *
 * In plaats van een type mee te geven aan de Factory methode, abstraheren we hier de volledige implementatie van de
 * Factory. Het is aan de concrete implementaties om geldige instanties van de gevraagde objecten terug te geven.
 */
public interface VehicleFactory {
    /**
     * Maakt een watervoertuig aan.
     *
     * @return een watervoertuig
     */
    AquaticVehicle createAquaticVehicle();

    /**
     * Maakt een wegvoertuig aan.
     *
     * @return een wegvoertuig
     */
    RoadVehicle createRoadVehicle();
}

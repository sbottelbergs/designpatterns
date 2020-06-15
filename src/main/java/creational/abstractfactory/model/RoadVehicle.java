package creational.abstractfactory.model;

/**
 * Interface voor landvoertuigen.
 */
public interface RoadVehicle {
    /**
     * Geeft het aantal banden terug van het landvoertuig (alles boven 2 is lame)
     *
     * @return het aantal banden.
     */
    int getNumberOfTires();
}

package creational.abstractfactory;

import creational.abstractfactory.factory.AwesomeVehicleFactory;
import creational.abstractfactory.factory.BoringVehicleFactory;
import creational.abstractfactory.factory.VehicleFactory;
import creational.abstractfactory.model.AquaticVehicle;
import creational.abstractfactory.model.RoadVehicle;

/**
 * Bij het gebruik van de abstract Factory, initialiseren we eerst de factory volgens een of andere configuratie.
 * In dit geval initialiseren we de Factory aan de hand van het awesomeness level.
 *
 * Onze factory is in staat om een watervoertuig en een wegvoertuig aan te maken voor ons.
 * Indien het awesomeness level onder de 10 is, worden er saaie voertuigen gemaakt, maar met alles daarboven
 * worden er awesome voertuigen gemaakt.
 */
public class AbstractFactoryExample {

    private static VehicleFactory factory;

    public static void main(String[] args) {
        // initialiseer de factory op basis van het awesomeness level
        initFactory(11);
//        initFactory(3);

        // laat de factory een watervoertuig aanmaken en print zijn snelheid
        AquaticVehicle aquaticVehicle = factory.createAquaticVehicle();
        System.out.println("Speed: " + aquaticVehicle.getSpeed());

        // laat de factory een wegvoertuig aanmaken en print het aantal banden
        RoadVehicle roadVehicle = factory.createRoadVehicle();
        System.out.println("Number of tires: " + roadVehicle.getNumberOfTires());
    }

    private static void initFactory(int awesomenessLevel) {
        if (awesomenessLevel > 10) {
            factory = new AwesomeVehicleFactory();
        } else {
            factory = new BoringVehicleFactory();
        }
    }
}

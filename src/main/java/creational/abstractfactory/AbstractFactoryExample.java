package creational.abstractfactory;

public class AbstractFactoryExample {

    private static VehicleFactory factory;

    public static void main(String[] args) {
        // initialiseer de factory op basis van het awesomeness level
        initFactory(10);
//        initFactory(3);

        // laat de factory een watervoertuig aanmaken en print zijn snelheid
        AquaticVehicle aquaticVehicle = factory.createAquaticVehicle();
        System.out.println("Speed: " + aquaticVehicle.getSpeed());

        // laat de factory een wegvoertuig aanmaken en print het aantal banden
        RoadVehicle roadVehicle = factory.createRoadVehicle();
        System.out.println("Number of tires: " + roadVehicle.getNumberOfTires());
    }

    private static void initFactory(int awesomenessLevel) {
        if (awesomenessLevel >= 10) {
            factory = new AwesomeVehicleFactory();
        } else {
            factory = new BoringVehicleFactory();
        }
    }
}

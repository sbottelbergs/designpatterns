package creational.singleton;

import creational.singleton.singleton.Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        // Verkrijg een EERSTE REFERENTIE naar de Singleton
        Singleton aSingletonInstance = Singleton.getInstance();
        printNumberOfTimesCalled(aSingletonInstance.getNumberOfTimesCalled());
        /* Output:
         * Number of times called: 0
         */

        // Verhoog het aantal oproepen op de EERSTE REFERENTIE
        aSingletonInstance.increaseNumberOfTimesCalled();
        aSingletonInstance.increaseNumberOfTimesCalled();
        aSingletonInstance.increaseNumberOfTimesCalled();
        printNumberOfTimesCalled(aSingletonInstance.getNumberOfTimesCalled());
        /* Output:
         * Number of times called: 3
         */

        // Verkrijg een TWEEDE REFERENTIE naar de Singleton
        Singleton aSecondSingletonInstance = Singleton.getInstance();
        printNumberOfTimesCalled(aSecondSingletonInstance.getNumberOfTimesCalled());
        /* Output:
         * Number of times called: 3
         */
        // Merk op dat de TWEEDE REFERENTIE al onmiddellijk aangeeft dat hij 3x is opgeroepen

        // Verhoog het aantal oproepen op de TWEEDE REFERENTIE
        aSecondSingletonInstance.increaseNumberOfTimesCalled();
        aSecondSingletonInstance.increaseNumberOfTimesCalled();

        // Print het aantal oproepen van de EERSTE REFERENTIE
        printNumberOfTimesCalled(aSingletonInstance.getNumberOfTimesCalled());
        /* Output:
         * Number of times called: 5
         */

        /* Merk op dat het aantal oproepen van de EERSTE REFERENTIE ook verhoogd is.

         * Ondanks dat we de increase operatie op de TWEEDE REFERENTIE hebben uitgevoerd (aSecondSingletonInstance),
         * verhoogt ook het aantal oproepen voor de EERSTE REFERENTIE (aSingletonInstance). Deze verwijzen namelijk
         * beiden naar dezelfde instantie.
         */
    }

    private static void printNumberOfTimesCalled(int numberOfTimesCalled) {
        System.out.println("Number of times called: " + numberOfTimesCalled);
    }
}

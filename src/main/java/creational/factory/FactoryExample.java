package creational.factory;

public class FactoryExample {

    public static void main(String[] args) {
        // Verkrijg een instantie van de Factory
        final Factory factory = new Factory();

        // Vraag de factory voor instanties op basis van de meegegeven String en roep de interface methode op
        TheInterface first = factory.create(Factory.A);
        first.aMethod();

        TheInterface second = factory.create(Factory.ANOTHER);
        second.aMethod();

        TheInterface third = factory.create(Factory.A_THIRD);
        third.aMethod();

        /* Indien we een String meegeven waarvoor de Factory geen concrete instantie kan teruggeven
         * wordt er een IllegalArgumentException gegooid.
         */
        try {
            factory.create("Illegal Argument");
        } catch (IllegalArgumentException iae) {
            System.out.println("Illegal Argument");
        }

        /* Output:
         * AConcreteClass#withAMethod
         * AnotherConcreteClass#withAMethod
         * AThirdConcreteClass#withAMethod
         * Illegal Argument
         */
    }
}

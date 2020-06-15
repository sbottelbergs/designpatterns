package creational.factorymethod;

import creational.factorymethod.factory.SomeFactory;
import creational.factorymethod.factory.SomeOtherFactory;
import creational.factorymethod.model.SomeClass;
import creational.factorymethod.model.SomeInterface;

import java.util.Calendar;

public class FactoryExample {

    public static void main(String[] args) {
        // Verkrijg een instantie van de Factory en doe de operatie
        final SomeFactory factory = new SomeFactory();
        factory.doSomething();

        // Verkrijg een instantie van een andere Factory en doe de operatie
        final SomeOtherFactory otherFactory = new SomeOtherFactory();
        otherFactory.doSomething();

        /** Hier gebruiken we rechtstreeks de Factory methode {@link SomeClass#create(String)}
         * van de SomeClass klasse.
         *
         * Andere voorbeelden van dit patroon zijn {@link String#valueOf(int)} en {@link Calendar#getInstance()}
         */
        final SomeInterface uselessClass = SomeClass.create("nothing");
        uselessClass.performOperation();

        /* Output:
         * SomeClass: doing something
         * SomeOtherClass: doing something
         * SomeClass: doing nothing
         */
    }
}

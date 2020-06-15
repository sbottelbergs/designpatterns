package structural.facade;

import structural.facade.complex.AnotherDependencyOfComplexObject;
import structural.facade.complex.ComplexObject;
import structural.facade.complex.DependencyOfComplexObject;
import structural.facade.facade.SimpleFacade;

public class FacadeExample {
    public static void main(String[] args) {
        runBadExample();
        /* Output:
         * *** BAD EXAMPLE ***
         * Performing operation with An argument and 123
         * Dependency: true
         * Another dependency: Another dependency
         */

        runFacadeExample();
        /* Output:
         * *** FACADE EXAMPLE ***
         * Performing operation with An argument and 123
         * Dependency: true
         * Another dependency: Another dependency
         */
    }

    /**
     * Het (correct) aanmaken van de {@link ComplexObject} klasse, om uiteindelijk de methode
     * {@link ComplexObject#performOperation(String, int)} te kunnen uitvoeren is omslachtig en foutgevoelig.
     * Men moet namelijk op de hoogte zijn van de implementatie details van {@link ComplexObject} om te weten
     * welke objecten (met welke state) we allemaal moeten meegeven.
     *
     * Daarbovenop moeten we dit iedere keer doen als we een instantie van {@link ComplexObject} nodig hebben...
     */
    private static void runBadExample() {
        System.out.println("*** BAD EXAMPLE ***");
        DependencyOfComplexObject dependencyOfComplexObject = new DependencyOfComplexObject();
        dependencyOfComplexObject.setState(true);
        ComplexObject complexObject = new ComplexObject(dependencyOfComplexObject);
        complexObject.setAnotherDependencyOfComplexObject(new AnotherDependencyOfComplexObject("Another dependency"));
        complexObject.performOperation("An argument", 123);
    }

    /**
     * Beter is om al deze complexiteit te verstoppen achter een veel simpelere methode. De complexiteit vermindert
     * allicht niet, maar zit wel gecentreerd op 1 plaats, en is veel gemakkelijker op te roepen en te gebruiken.
     *
     * Het resultaat is hetzelfde, maar het gebruik van de complexe logica zit verstopt achter de schijnbaar
     * eenvoudige abstractie van {@link SimpleFacade#doYourThing()}.
     */
    private static void runFacadeExample() {
        System.out.println("\n*** FACADE EXAMPLE ***");
        SimpleFacade facade = new SimpleFacade();
        facade.doYourThing();
    }
}

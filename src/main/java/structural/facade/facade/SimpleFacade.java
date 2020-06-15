package structural.facade.facade;

import structural.facade.complex.AnotherDependencyOfComplexObject;
import structural.facade.complex.ComplexObject;
import structural.facade.complex.DependencyOfComplexObject;

/**
 * Deze simpele facade verstopt de complexiteit van het aanmaken van {@link ComplexObject} en het uitvoeren
 * van de complexe operatie {@link ComplexObject#performOperation(String, int)}.
 */
public class SimpleFacade {
    /**
     * Simpele abstractie bovenop het uitvoeren van een complexe operatie
     */
    public void doYourThing() {
        DependencyOfComplexObject dependencyOfComplexObject = new DependencyOfComplexObject();
        dependencyOfComplexObject.setState(true);
        ComplexObject complexObject = new ComplexObject(dependencyOfComplexObject);
        complexObject.setAnotherDependencyOfComplexObject(new AnotherDependencyOfComplexObject("Another dependency"));
        complexObject.performOperation("An argument", 123);
    }
}

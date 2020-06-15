package structural.facade.complex;

/**
 * Voorbeeld van een complex object met veel specifieke dependencies.
 */
public class ComplexObject {
    DependencyOfComplexObject dependencyOfComplexObject;
    AnotherDependencyOfComplexObject anotherDependencyOfComplexObject;

    /**
     * Non-default constructor om de eerste dependency te zetten
     *
     * @param dependencyOfComplexObject de eerste dependency
     */
    public ComplexObject(DependencyOfComplexObject dependencyOfComplexObject) {
        this.dependencyOfComplexObject = dependencyOfComplexObject;
    }

    /**
     * Zet de andere dependency.
     *
     * @param anotherDependencyOfComplexObject de andere dependency
     */
    public void setAnotherDependencyOfComplexObject(AnotherDependencyOfComplexObject anotherDependencyOfComplexObject) {
        this.anotherDependencyOfComplexObject = anotherDependencyOfComplexObject;
    }

    /**
     * Complexe operatie, die gebruik maakt van veel specifieke logica. Zo wordt er bijvoorbeeld gekeken of de
     * dependency {@link DependencyOfComplexObject} zich in de juiste state bevindt. Indien dit niet het geval is
     * wordt er een exception gegooid.
     *
     * @param anArgument een argument dat de uitvoer van de operatie beïnvloedt
     * @param anotherArgument een ander argument dat de uitvoer van de operatie beïnvloedt
     * @throws IllegalStateException indien {@link DependencyOfComplexObject#getState()} false teruggeeft
     */
    public void performOperation(String anArgument, int anotherArgument) {
        if (dependencyOfComplexObject.getState()) {
            System.out.println(String.format("Performing operation with %s and %d", anArgument, anotherArgument));
            System.out.println("Dependency: " + dependencyOfComplexObject.getState());
            System.out.println("Another dependency: " + anotherDependencyOfComplexObject.getState());
        } else {
            throw new IllegalStateException();
        }
    }
}

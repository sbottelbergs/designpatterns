package creational.factorymethod.model;

/**
 * Een implementatie van de {@link SomeInterface} interface.
 */
public class SomeClass implements SomeInterface {
    private String operation;

    /**
     * Default constructor
     */
    public SomeClass() {
        this("something");
    }

    /**
     * private non-default constructor. Krijgt een operatie als argument en slaat deze op.
     *
     * @param operation de operatie die moet worden uitgevoerd
     */
    private SomeClass(String operation) {
        this.operation = operation;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void performOperation() {
        System.out.println("SomeClass: doing " + operation);
    }

    /**
     * Een ander voorbeeld van een Factory methode. Deze methode maakt een instantie van SomeClass
     * op basis van de meegegeven operatie. Deze methode heeft toegang tot de niet-default constructor
     * van SomeClass {@link #SomeClass(String)} en is de enige manier om een niet-default instantie van
     * deze klasse aan te maken.
     *
     * @param operation de operatie
     * @return een instantie van SomeClass
     */
    public static SomeClass create(String operation) {
        return new SomeClass(operation);
    }
}

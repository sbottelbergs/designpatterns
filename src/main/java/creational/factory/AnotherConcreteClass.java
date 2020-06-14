package creational.factory;

/**
 * Klasse die {@link TheInterface} implementeert
 */
public class AnotherConcreteClass implements TheInterface {

    /**
     * {@inheritDoc}
     */
    @Override
    public void aMethod() {
        System.out.println("AnotherConcreteClass#withAMethod");
    }
}

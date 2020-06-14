package creational.factory;

/**
 * Klasse die {@link TheInterface} implementeert
 */
public class AConcreteClass implements TheInterface {

    /**
     * {@inheritDoc}
     */
    @Override
    public void aMethod() {
        System.out.println("AConcreteClass#withAMethod");
    }
}

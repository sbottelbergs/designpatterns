package creational.factory;

/**
 * Klasse die {@link TheInterface} implementeert
 */
public class AThirdConcreteClass implements TheInterface {

    /**
     * {@inheritDoc}
     */
    @Override
    public void aMethod() {
        System.out.println("AThirdConcreteClass#withAMethod");
    }
}

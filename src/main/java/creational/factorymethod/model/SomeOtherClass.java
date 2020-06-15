package creational.factorymethod.model;

/**
 * Een tweede implementatie van de {@link SomeInterface} interface.
 */
public class SomeOtherClass implements SomeInterface {
    /**
     * {@inheritDoc}
     */
    @Override
    public void performOperation() {
        System.out.println("SomeOtherClass: doing something");
    }

}

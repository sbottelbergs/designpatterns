package creational.factorymethod.factory;

import creational.factorymethod.model.SomeInterface;
import creational.factorymethod.model.SomeOtherClass;

/**
 * Een tweede implementatie van {@link SomeAbstractFactory}
 */
public class SomeOtherFactory extends SomeAbstractFactory {

    /**
     * {@inheritDoc}
     */
    protected SomeInterface createSomeConcreteClass() {
        return new SomeOtherClass();
    }

}

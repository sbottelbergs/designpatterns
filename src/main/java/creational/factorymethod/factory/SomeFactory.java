package creational.factorymethod.factory;

import creational.factorymethod.model.SomeClass;
import creational.factorymethod.model.SomeInterface;

/**
 * Een implementatie van {@link SomeAbstractFactory}
 */
public class SomeFactory extends SomeAbstractFactory {

    /**
     * {@inheritDoc}
     */
    protected SomeInterface createSomeConcreteClass() {
        return new SomeClass();
    }

}

package creational.factorymethod.factory;

import creational.factorymethod.model.SomeInterface;

/**
 * Een abstracte klasse die gebruik maakt van een factory method om een instantie van de andere klasse te verkrijgen.
 * iedere klasse die alfeidt van deze klasse, moet de factory method {@link #createSomeConcreteClass} implementeren
 */
public abstract class SomeAbstractFactory {
    /**
     * Deze methode maakt een object aan via de factory methode en voert er dan een operatie op uit.
     */
    public void doSomething() {
        SomeInterface someInterface = createSomeConcreteClass();
        someInterface.performOperation();
    }

    /**
     * De factory methode. Concrete factories die van deze klasse overerven, moeten een implementatie
     * voorzien voor deze methode.
     *
     * @return een concrete implementatie van de {@link SomeInterface} interface
     */
    protected abstract SomeInterface createSomeConcreteClass();
}

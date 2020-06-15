package structural.facade.complex;

/**
 * Een andere dependency van {@link ComplexObject}.
 */
public class AnotherDependencyOfComplexObject {
    private String state;

    /**
     * Non-default constructor om het object te initialiseren met een bepaalde state
     *
     * @param state de state waarmee we deze klasse initialiseren
     */
    public AnotherDependencyOfComplexObject(String state) {
        this.state = state;
    }

    /**
     * Geef de state terug.
     *
     * @return de state
     */
    public String getState() {
        return state;
    }
}

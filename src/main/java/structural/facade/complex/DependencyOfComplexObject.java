package structural.facade.complex;

/**
 * Een dependency van {@link ComplexObject}
 */
public class DependencyOfComplexObject {
    private boolean state;

    /**
     * Zet de state.
     *
     * @param state de state
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * Geef de state terug.
     *
     * @return de state
     */
    public boolean getState() {
        return this.state;
    }
}

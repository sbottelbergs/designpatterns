package behavioural.state.state;

/**
 * Interface die de state voorstelt.
 */
public interface State {
    /**
     * Schrijf de naam op de console, afhankelijk van de eigen state.
     *
     * @param context de state context
     * @param name de naam om te schrijven
     */
    void writeName(StateContext context, String name);
}

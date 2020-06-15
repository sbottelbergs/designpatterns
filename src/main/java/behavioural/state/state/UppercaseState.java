package behavioural.state.state;

/**
 * Uppercase state. Schrijft de meegegeven naam steeds in uppercase.
 */
public class UppercaseState implements State {
    private int count;

    public UppercaseState() {
        count = 0;
    }

    /**
     * {@inheritDoc}
     *
     * Schrijf de meegegeven naam in uppercase op de console. Na 2x aangeroepen te worden,
     * wordt de state doorgegeven aan {@link LowercaseState}
     */
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toUpperCase());
        count++;
        if (count > 1) {
            context.setState(new LowercaseState());
        }
    }
}

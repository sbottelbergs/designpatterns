package behavioural.state.state;

/**
 * Lowercase state. Schrijft de meegegeven naam steeds in lower case.
 */
public class LowercaseState implements State {
    /**
     * {@inheritDoc}
     */
    @Override
    public void writeName(StateContext context, String name) {
        System.out.println(name.toLowerCase());

        // update de statecontext met de andere state
        context.setState(new UppercaseState());
    }
}

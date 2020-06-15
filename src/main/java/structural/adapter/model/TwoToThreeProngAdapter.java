package structural.adapter.model;

/**
 * Adapter die omzet van een 2-pin stekker naar een 3-pin stekker.
 * Deze klasse implementeert de {@link ThreeProngPlug} interface en krijgt een instantie van een
 * {@link TwoProngPlug} mee als constructor argument.
 */
public class TwoToThreeProngAdapter implements ThreeProngPlug {

    private TwoProngPlug twoProngPlug;

    /**
     * Non-defaul constructor die een 2-pin stekker verwacht.
     *
     * @param twoProngPlug de 2-pin stekker
     */
    public TwoToThreeProngAdapter(TwoProngPlug twoProngPlug) {
        this.twoProngPlug = twoProngPlug;
    }

    /**
     * We implementeren de interface methode {@link ThreeProngPlug#useThreeProngPlug()} van de
     * {@link ThreeProngPlug} interface, en maken hierbij achterliggend gebruik van de {@link TwoProngPlug} die
     * ons werd meegegeven via de constructor.
     */
    @Override
    public void useThreeProngPlug() {
        twoProngPlug.useTwoProngPlug();
    }
}

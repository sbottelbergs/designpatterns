package structural.adapter.model;

/**
 * Interface voor een 2-pin stekker. Deze is niet rechtstreeks compatibel met {@link ThreeProngPowerOutlet}.
 */
public interface TwoProngPlug {
    /**
     * Gebruik de 2-pin stekker.
     */
    void useTwoProngPlug();
}

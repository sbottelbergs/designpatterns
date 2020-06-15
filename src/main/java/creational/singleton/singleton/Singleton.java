package creational.singleton.singleton;

/**
 * Singleton klasse. Er is altijd maximaal 1 instantie van de Singleton beschikbaar tijdens de runtime van de applicatie.
 * De combinatie van private constructor en static {@link #getInstance} methode garandeert dit.
 *
 * Door de constructor private te maken, kunnen we geen nieuwe instantie van deze klasse aanmaken.
 * Als we de Singleton willen gebruiken, zijn we verplicht om de {@link #getInstance()} methode aan te roepen)
 */
public class Singleton {
    private static Singleton instance;

    /**
     * Utility method om de instantie van de Singleton terug te geven.
     * Er gebeurt ook een lichte optimalisatie: door de Singleton instance pas te initialiseren op het moment
     * dat deze de eerste keer wordt aangeroepen, alloceren we niet onnodig geheugen voor de static instance.
     *
     * @return de (enige) instantie van de Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private int numberOfTimesCalled;

    private Singleton() {
        numberOfTimesCalled = 0;
    }

    /**
     * Methode om de state van de Singleton aan te passen
     */
    public void increaseNumberOfTimesCalled() {
        numberOfTimesCalled++;
    }

    /**
     * Geeft het aantal keren dat {@link #increaseNumberOfTimesCalled()} werd aangeroepen.
     *
     * @return het aantal keren dat {@link #increaseNumberOfTimesCalled()} werd aangeroepen
     */
    public int getNumberOfTimesCalled() {
        return numberOfTimesCalled;
    }
}

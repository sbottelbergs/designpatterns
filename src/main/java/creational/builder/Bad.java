package creational.builder;

/**
 * Voorbeeld om aan te tonen dat te veel constructor parameters met hetzelfde datatype geen goed idee is.
 * Als we deze klasse willen instantiëren, moeten we een heleboel Strings en booleans meegeven.
 *
 * Hierdoor zijn we in het beste geval afhankelijk van de hints van de IDE, maar zelfs dan is dit nog steeds
 * zeer foutgevoelig. Inderdaad, stel we voegen een derde boolean waarde toe, maar voegen deze in onze constructor
 * toe vóór 'anotherBoolean', waardoor we de volgende constructor krijgen:
 *
 * public Bad(String aString, String anotherString, String aThirdString, boolean aBoolean, boolean aThirdBoolean, boolean anotherBoolean)
 *
 * Nu moeten we al zeer voorzichtig zijn om op iedere plaats waar we deze klasse instantiëren ervoor te zorgen dat we
 * de juiste boolean waarde aan de juiste variabele koppelen, maar dit wordt al zeer snel zeer omslachtig en foutgevoelig.
 */
public class Bad {
    private String aString;
    private String anotherString;
    private String aThirdString;
    private boolean aBoolean;
    private boolean anotherBoolean;

    public Bad(String aString, String anotherString, String aThirdString, boolean aBoolean, boolean anotherBoolean) {
        this.aString = aString;
        this.anotherString = anotherString;
        this.aThirdString = aThirdString;
        this.aBoolean = aBoolean;
        this.anotherBoolean = anotherBoolean;
    }

    @Override
    public String toString() {
        return "Bad{" +
                "aString='" + aString + '\'' +
                ", anotherString='" + anotherString + '\'' +
                ", aThirdString='" + aThirdString + '\'' +
                ", aBoolean=" + aBoolean +
                ", anotherBoolean=" + anotherBoolean +
                '}';
    }
}

package creational.factory;

/**
 * De Factory klasse
 */
public class Factory {

    public static final String A = "A";
    public static final String ANOTHER = "ANOTHER";
    public static final String A_THIRD = "A-THIRD";

    /**
     * De Factory methode die de correcte concrete implementatie van de {@link TheInterface} interface
     * teruggeeft op basis van het meegegeven type.
     *
     * @param type het type
     * @return de correcte concrete implementatie van de {@link TheInterface} interface op basis van het meegegeven type
     */
    public TheInterface create(final String type) {
        if (type.equalsIgnoreCase(A)) {
            return new AConcreteClass();
        } else if (type.equalsIgnoreCase(ANOTHER)) {
            return new AnotherConcreteClass();
        } else if (type.equalsIgnoreCase(A_THIRD)) {
            return new AThirdConcreteClass();
        }
        throw new IllegalArgumentException();
    }
}

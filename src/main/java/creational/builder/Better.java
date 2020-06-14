package creational.builder;

/**
 * Dit voorbeeld is al iets beter. We hebben hier de constructor private gemaakt en een static inner class 'Builder' toegevoegd.
 * Om een instantie van deze klasse te kunnen verkrijgen, moet men nu eerst een instantie van de builder aanmaken.
 *
 * Deze klasse heeft een aantal setters: setAString(), setAnotherString()... Deze methodes maken het veel duidelijker
 * welke waarde men is aan het zetten. De "build()" methode geeft uiteindelijk een instantie terug van het Better object.
 * De builder kan namelijk wél aan de private constructor van de Better klasse.
 *
 * Hier bestaat echter hetzelfde probleem als voordien: wat als we een derde boolean waarde toevoegen tussen de eerste twee?
 * Het voordeel is hier in ieder geval wel dat er maar ooit op 1 plaats een "new" gedaan wordt van ons Better object,
 * dus het probleem hoeft maar op 1 plaats opgelost te worden (in de build() methode zelf)
 */
public class Better {
    private String aString;
    private String anotherString;
    private String aThirdString;
    private boolean aBoolean;
    private boolean anotherBoolean;

    private Better(String aString, String anotherString, String aThirdString, boolean aBoolean, boolean anotherBoolean) {
        this.aString = aString;
        this.anotherString = anotherString;
        this.aThirdString = aThirdString;
        this.aBoolean = aBoolean;
        this.anotherBoolean = anotherBoolean;
    }

    @Override
    public String toString() {
        return "Better{" +
                "aString='" + aString + '\'' +
                ", anotherString='" + anotherString + '\'' +
                ", aThirdString='" + aThirdString + '\'' +
                ", aBoolean=" + aBoolean +
                ", anotherBoolean=" + anotherBoolean +
                '}';
    }

    public static class Builder {
        private String aString;
        private String anotherString;
        private String aThirdString;
        private boolean aBoolean;
        private boolean anotherBoolean;

        public void setAString(String aString) {
            this.aString = aString;
        }

        public void setAnotherString(String anotherString) {
            this.anotherString = anotherString;
        }

        public void setAThirdString(String aThirdString) {
            this.aThirdString = aThirdString;
        }

        public void setABoolean(boolean aBoolean) {
            this.aBoolean = aBoolean;
        }

        public void setAnotherBoolean(boolean anotherBoolean) {
            this.anotherBoolean = anotherBoolean;
        }

        public Better build() {
            return new Better(
                    aString,
                    anotherString,
                    aThirdString,
                    aBoolean,
                    anotherBoolean
            );
        }
    }

    /**
     * Om het nog iets gemakkelijker te maken, kunnen we gebruik maken van een Fluent builder.
     * Dit type van builder geeft telkens een instantie van zichzelf terug, zodat operaties vlak na mekaar
     * kunnen worden toegepast, beter bekend als method chaining.
     *
     * Dit herken je normaal gezien van de builders die Lombok genereert
     */
    public static class FluentBuilder {
        private String aString;
        private String anotherString;
        private String aThirdString;
        private boolean aBoolean;
        private boolean anotherBoolean;

        public FluentBuilder withAString(String aString) {
            this.aString = aString;
            return this;
        }

        public FluentBuilder withAnotherString(String anotherString) {
            this.anotherString = anotherString;
            return this;
        }

        public FluentBuilder withAThirdString(String aThirdString) {
            this.aThirdString = aThirdString;
            return this;
        }

        public FluentBuilder withABoolean(boolean aBoolean) {
            this.aBoolean = aBoolean;
            return this;
        }

        public FluentBuilder withAnotherBoolean(boolean anotherBoolean) {
            this.anotherBoolean = anotherBoolean;
            return this;
        }

        public Better build() {
            return new Better(
                    aString,
                    anotherString,
                    aThirdString,
                    aBoolean,
                    anotherBoolean
            );
        }
    }

}

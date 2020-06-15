package structural.proxy;

import structural.proxy.proxy.DefaultInternetConnection;
import structural.proxy.proxy.InternetConnection;
import structural.proxy.proxy.ProxiedInternetConnection;
import structural.proxy.proxy.RestrictedInternetConnection;

/**
 * We kunnen het proxy patroon voor verschillende redenen gebruiken, meestal om tijds- of resource-intensieve
 * operaties te vermijden op een, voor de rest van de applicatie, doorzichtige manier.
 *
 * Simpel gezegd is een proxy een klasse die dezelfde interface implementeert als de echte klasse die we willen
 * gebruiken, en dus in diens plaats gebruikt kan worden. De proxy bevat een referentie naar de echte klasse en kan
 * bepaalde operaties ofwel onderscheppen, ofwel effectief laten uitvoeren door de echte klasse.
 *
 * De proxy kan ook bepaalde precondities zetten, of bijvoorbeeld security toevoegen op een http call.
 */
public class ProxyExample {
    public static void main(String[] args) {
        // Met een default internet connectie kunnen we rechtstreeks aan het internet.
        System.out.println("*** DEFAULT CONNECTION ***");
        InternetConnection defaultConnection = new DefaultInternetConnection();
        System.out.println(defaultConnection.retrieveData("someUrl"));
        /* Output:
         * *** DEFAULT CONNECTION ***
         * Data from URL "someUrl"
         */

        /* Een ProxiedInternetConnection kan ook aan het internet, maar indien we een bepaalde url al hebben
         * opgevraagd, halen we het resultaat gewoon uit onze lokale cache
         */
        System.out.println("\n*** PROXIED CONNECTION ***");
        InternetConnection proxiedConnection = new ProxiedInternetConnection(defaultConnection);
        System.out.println(proxiedConnection.retrieveData("someUrl"));
        System.out.println(proxiedConnection.retrieveData("someUrl"));
        /* Output:
         * *** PROXIED CONNECTION ***
         * Data from URL "someUrl"
         * Data from URL "someUrl" (cached)
         */

        /* Een RestrictedInternetConnection ten slotte laat ons toe om iets meer controle te hebben over
         * het soort urls dat bezocht mag worden.
         * We kunnen hier eventueel ook gebruik maken van de proxiedConnection in plaats van de defaultConnection
         */
        System.out.println("\n*** RESTRICTED CONNECTION ***");
        InternetConnection restrictedConnection = new RestrictedInternetConnection(defaultConnection);
        System.out.println(restrictedConnection.retrieveData("someUrl"));
        try {
            restrictedConnection.retrieveData("google");
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
        /* Output:
         * *** RESTRICTED CONNECTION ***
         * Data from URL "someUrl"
         * Trying to access banned site: google. A state official is on their way.
         */
    }
}

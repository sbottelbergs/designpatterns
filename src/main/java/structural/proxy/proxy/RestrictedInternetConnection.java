package structural.proxy.proxy;

import java.util.HashSet;
import java.util.Set;

/**
 * Bepaalde boosaardige overheden willen hun burgers soms de toegang tot bepaalde informatie
 * ontzeggen. Ook dit kan met behulp van een proxy.
 */
public class RestrictedInternetConnection implements InternetConnection {

    private Set<String> bannedSites;
    private InternetConnection internetConnection;

    public RestrictedInternetConnection(InternetConnection internetConnection) {
        this.internetConnection = internetConnection;

        bannedSites = new HashSet<>();
        bannedSites.add("google");
    }

    /**
     * We gaan eerst na of we de gevraagde url wel mogen bezoeken. Indien het niet mag gooien we een exception.
     */
    @Override
    public String retrieveData(String url) {
        if (bannedSites.stream().anyMatch(banned -> url.toLowerCase().contains(banned))) {
            throw new RuntimeException("Trying to access banned site: " + url + ". A state official is on their way.");
        }
        return internetConnection.retrieveData(url);
    }
}

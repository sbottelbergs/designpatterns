package structural.proxy.proxy;

/**
 * Interface die een internetconnectie voorstelt
 */
public interface InternetConnection {
    /**
     * Methode om data op het halen van een bepaalde url.
     *
     * @param url de url
     * @return de data die zich op de URL bevindt
     */
    String retrieveData(String url);
}

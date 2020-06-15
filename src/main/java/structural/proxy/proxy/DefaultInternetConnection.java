package structural.proxy.proxy;

/**
 * Implementatie die een standaard internet connectie voorstelt.
 */
public class DefaultInternetConnection implements InternetConnection {

    /**
     * {@inheritDoc}
     */
    @Override
    public String retrieveData(String url) {
        return String.format("Data from URL \"%s\"", url);
    }
}

package structural.proxy.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxiedInternetConnection implements InternetConnection {
    private Map<String, String> dataCache;
    private InternetConnection internetConnection;

    public ProxiedInternetConnection(InternetConnection internetConnection) {
        this.internetConnection = internetConnection;
        dataCache = new HashMap<>();
    }

    @Override
    public String retrieveData(String url) {
        if (dataCache.containsKey(url)) {
            return dataCache.get(url) + " (cached)";
        }

        String data = internetConnection.retrieveData(url);
        dataCache.put(url, data);
        return data;
    }
}

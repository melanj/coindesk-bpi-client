package org.example.bpiClient.common;

import org.example.bpiClient.model.SupportedCurrency;

/**
 * Provides support to get supported API currencies.
 */
public class SupportedCurrenciesClient extends JsonClient<SupportedCurrency[]> {
    private static final String URL_FORMAT = "%s/supported-currencies.json";
    private final String baseUrl;

    public SupportedCurrenciesClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    protected String getFullUrl() {
        return String.format(URL_FORMAT, baseUrl);
    }
}

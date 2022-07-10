package org.example.bpiClient.common;

import org.example.bpiClient.model.CurrentPrice;

/**
 * Provides support to get BPI current price.
 */
public class CurrentPriceClient extends JsonClient<CurrentPrice> {
    private static final String URL_FORMAT = "%s/currentprice/%s.json";
    private final String baseUrl;
    private final String currency;

    private CurrentPriceClient(Builder builder) {
        this.baseUrl = builder.baseUrl;
        this.currency = builder.currency;
    }

    @Override
    protected String getFullUrl() {
        return String.format(URL_FORMAT, baseUrl, currency);
    }

    /**
     * A builder for {@link CurrentPriceClient}.
     */
    public static class Builder {

        private String baseUrl;
        private String currency;

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public CurrentPriceClient build() {
            CurrentPriceClient client = new CurrentPriceClient(this);
            validate(client);
            return client;
        }

        private void validate(CurrentPriceClient client) {
            CommonUtils.validateUrl(client.baseUrl);
            CommonUtils.validateCurrency(client.currency);
        }

    }
}

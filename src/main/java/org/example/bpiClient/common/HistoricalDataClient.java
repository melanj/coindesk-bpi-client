package org.example.bpiClient.common;

import org.example.bpiClient.model.HistoricalData;

import java.time.LocalDate;

/**
 * Provides support to get BPI historical data.
 */
public class HistoricalDataClient extends JsonClient<HistoricalData> {
    private static final String URL_FORMAT = "%s/historical/close.json?start=%s&end=%s&currency=%s";
    private final String baseUrl;
    private final LocalDate start;
    private final LocalDate end;
    private final String currency;

    private HistoricalDataClient(Builder builder) {
        this.baseUrl = builder.baseUrl;
        this.start = builder.start;
        this.end = builder.end;
        this.currency = builder.currency;
    }

    @Override
    protected String getFullUrl() {
        return String.format(URL_FORMAT,
                baseUrl, start.toString(), end.toString(), currency);
    }

    /**
     * A builder for {@link HistoricalDataClient}.
     */
    public static class Builder {

        private String baseUrl;
        private LocalDate start;
        private LocalDate end;
        private String currency;

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public Builder start(LocalDate start) {
            this.start = start;
            return this;
        }

        public Builder end(LocalDate end) {
            this.end = end;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public HistoricalDataClient build() {
            HistoricalDataClient client = new HistoricalDataClient(this);
            validate(client);
            return client;
        }

        private void validate(HistoricalDataClient client) {
            CommonUtils.validateUrl(client.baseUrl);
            CommonUtils.validateCurrency(client.currency);
            CommonUtils.validateDateRange(client.start, client.end);
        }

    }
}

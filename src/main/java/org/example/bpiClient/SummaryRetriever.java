package org.example.bpiClient;

import org.example.bpiClient.common.CurrentPriceClient;
import org.example.bpiClient.common.HistoricalDataClient;
import org.example.bpiClient.model.CurrentPrice;
import org.example.bpiClient.model.HistoricalData;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;

public class SummaryRetriever {

    private final String currency;
    private final CurrentPrice currentPrice;
    private final HistoricalData historicalData;

    /**
     * @param baseUrl
     * @param currency
     * @param numberOfDays
     * @throws Exception
     */
    public SummaryRetriever(String baseUrl, String currency, int numberOfDays) throws Exception {
        this.currency = currency;
        currentPrice = new CurrentPriceClient.Builder().baseUrl(baseUrl).currency(currency)
                .build().invoke();
        historicalData = new HistoricalDataClient.Builder().baseUrl(baseUrl)
                .start(LocalDate.now().minusDays(numberOfDays)).end(LocalDate.now()).currency(currency)
                .build().invoke();
    }

    public String getCurrency() {
        return currency.toUpperCase();
    }

    public BigDecimal getCurrentRate() {
        return currentPrice.getBpi().get(currency.toUpperCase()).getRateFloat();
    }

    public BigDecimal getLowestRate() {
        return Collections.min(historicalData.getBpi().values());
    }

    public BigDecimal getHighestRate() {
        return Collections.max(historicalData.getBpi().values());
    }

}

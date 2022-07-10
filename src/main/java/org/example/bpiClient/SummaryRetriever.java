package org.example.bpiClient;

import org.example.bpiClient.common.CurrentPriceClient;
import org.example.bpiClient.common.HistoricalDataClient;
import org.example.bpiClient.model.CurrentPrice;
import org.example.bpiClient.model.HistoricalData;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;

/**
 * This class provides the implementation to retriever bitcoin price index summary.
 */
public class SummaryRetriever {

    private final String currency;
    private final CurrentPrice currentPrice;
    private final HistoricalData historicalData;

    /**
     * @param baseUrl      the base url of the endpoint.
     * @param currency     currency code.
     * @param numberOfDays number of days to lookup in history.
     * @throws Exception if error occurs while invoking the API.
     */
    public SummaryRetriever(String baseUrl, String currency, int numberOfDays) throws Exception {
        this.currency = currency;
        currentPrice = new CurrentPriceClient.Builder().baseUrl(baseUrl).currency(currency)
                .build().invoke();
        historicalData = new HistoricalDataClient.Builder().baseUrl(baseUrl)
                .start(LocalDate.now().minusDays(numberOfDays)).end(LocalDate.now()).currency(currency)
                .build().invoke();
    }

    /**
     * gets currency provided.
     *
     * @return currency code as a String.
     */
    public String getCurrency() {
        return currency.toUpperCase();
    }

    /**
     * The current Bitcoin rate, in the requested currency.
     *
     * @return as a BigDecimal.
     */
    public BigDecimal getCurrentRate() {
        return currentPrice.getBpi().get(currency.toUpperCase()).getRateFloat();
    }

    /**
     * The lowest Bitcoin rate in given number of days, in the requested currency.
     *
     * @return as a BigDecimal.
     */
    public BigDecimal getLowestRate() {
        return Collections.min(historicalData.getBpi().values());
    }

    /**
     * The highest Bitcoin rate in given number of days, in the requested currency.
     *
     * @return as a BigDecimal.
     */
    public BigDecimal getHighestRate() {
        return Collections.max(historicalData.getBpi().values());
    }

}

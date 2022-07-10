package org.example.bpiClient;

import org.example.bpiClient.common.CommonUtils;
import org.example.bpiClient.common.JsonClient;
import org.example.bpiClient.common.SupportedCurrenciesClient;
import org.example.bpiClient.model.SupportedCurrency;

import java.text.DecimalFormat;
import java.util.Currency;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * The bootstrap class for Coindesk BPI client which is Sample command-line Java program that fetches data
 * from the Coindesk BPI API.
 */
public class Main {

    private static final String BASE_URL = "https://api.coindesk.com/v1/bpi";
    private static final int NUMBER_OF_DAYS = 30;

    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter currency code:");
            String inputCurrency = scanner.next().toUpperCase();

            // verify currency code at java level i.e. ISO 4217 format.
            if (!CommonUtils.isValidCurrency(inputCurrency)) {
                System.err.println("your requested currency is not supported or is invalid");
                return;
            }

            // invokes supported-currencies API and further verify
            JsonClient<SupportedCurrency[]> currenciesClient = new SupportedCurrenciesClient(BASE_URL);
            SupportedCurrency[] supportedCurrencies = currenciesClient.invoke();
            boolean supportedCurrency = Stream.of(supportedCurrencies).map(SupportedCurrency::getCurrency)
                    .anyMatch(inputCurrency::equalsIgnoreCase);

            if (!supportedCurrency) {
                System.err.println("your requested currency is not supported");
                return;
            }

            Currency currency = Currency.getInstance(inputCurrency);
            SummaryRetriever summaryRetriever = new SummaryRetriever(BASE_URL, inputCurrency, NUMBER_OF_DAYS);

            DecimalFormat df = new DecimalFormat("#,###.0000");
            System.out.printf("The current Bitcoin rate: %s %s%n",
                    currency.getSymbol(), df.format(summaryRetriever.getCurrentRate()));
            System.out.printf("The lowest Bitcoin rate in the last 30 days: %s %s%n",
                    currency.getSymbol(), df.format(summaryRetriever.getLowestRate()));
            System.out.printf("The highest Bitcoin rate in the last 30 days: %s %s%n",
                    currency.getSymbol(), df.format(summaryRetriever.getHighestRate()));
        }

    }
}

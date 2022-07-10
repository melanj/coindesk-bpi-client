package org.example.bpiClient.common;

import org.example.bpiClient.model.HistoricalData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;

public class HistoricalDataClientTest extends JsonResponseMockedTest {

    private JsonClient<HistoricalData> client;

    @BeforeMethod
    public void setup() {
        client = new HistoricalDataClient.Builder()
                .baseUrl("https://dummy.com/v1")
                .start(LocalDate.parse("2022-06-09"))
                .end(LocalDate.parse("2022-07-09"))
                .currency("USD")
                .build();
    }

    @Test
    public void testInvoke() throws Exception {
        HistoricalData historicalData = client.invoke();
        Assert.assertNotNull(historicalData);
        Assert.assertEquals(historicalData.getDisclaimer(),
                "This data was produced from the CoinDesk Bitcoin Price Index. BPI value data returned as EUR.");
        Assert.assertEquals(historicalData.getBpi().size(), 9);
    }

    @Test
    public void testGetFullUrl() {
        Assert.assertEquals(client.getFullUrl(), "https://dummy.com/v1/historical/close.json?start=2022-06-09&end=2022-07-09&currency=USD");
    }

    @Test(expectedExceptions = ValidationException.class,
            expectedExceptionsMessageRegExp = "Invalid base-url")
    public void testInvalidCurrency() {
        new HistoricalDataClient.Builder()
                .baseUrl("wss://dummy.com/v1")
                .currency("USD")
                .start(LocalDate.parse("2022-06-09"))
                .end(LocalDate.parse("2022-07-09"))
                .build();
    }

    @Test(expectedExceptions = ValidationException.class,
            expectedExceptionsMessageRegExp = "Requested currency is not supported or is invalid")
    public void testInvalidBaseUrl() {
        new HistoricalDataClient.Builder()
                .baseUrl("https://dummy.com/v1")
                .currency("ZZZ")
                .start(LocalDate.parse("2022-06-09"))
                .end(LocalDate.parse("2022-07-09"))
                .build();
    }

    @Test(expectedExceptions = ValidationException.class,
            expectedExceptionsMessageRegExp = "The start date or the end date cannot be null")
    public void testNullStartDate() {
        new HistoricalDataClient.Builder()
                .baseUrl("https://dummy.com/v1")
                .currency("USD")
                .end(LocalDate.parse("2022-07-09"))
                .build();
    }

    @Test(expectedExceptions = ValidationException.class,
            expectedExceptionsMessageRegExp = "The start date or the end date cannot be null")
    public void testNullEndDate() {
        new HistoricalDataClient.Builder()
                .baseUrl("https://dummy.com/v1")
                .currency("USD")
                .start(LocalDate.parse("2022-06-09"))
                .build();
    }

    @Test(expectedExceptions = ValidationException.class,
            expectedExceptionsMessageRegExp = "The start date should be before the end date")
    public void testStartDateIsAfterEndDate() {
        new HistoricalDataClient.Builder()
                .baseUrl("https://dummy.com/v1")
                .currency("USD")
                .start(LocalDate.parse("2022-06-09"))
                .end(LocalDate.parse("2021-01-09"))
                .build();
    }
}
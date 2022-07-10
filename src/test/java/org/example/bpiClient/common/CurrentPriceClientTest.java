package org.example.bpiClient.common;

import org.example.bpiClient.model.CurrentPrice;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class CurrentPriceClientTest extends JsonResponseMockedTest  {

    private JsonClient<CurrentPrice> client;

    @BeforeMethod
    public void setup() {
        client =  new CurrentPriceClient.Builder()
                .baseUrl("https://dummy.com/v1")
                .currency("USD")
                .build();
    }

    @Test
    public void testInvoke() throws Exception {
        CurrentPrice currentPrice = client.invoke();
        Assert.assertEquals(currentPrice.getDisclaimer(),
                "This data was produced from the CoinDesk Bitcoin Price Index (USD). " +
                        "Non-USD currency data converted using hourly conversion rate from openexchangerates.org");
        Assert.assertEquals(currentPrice.getBpi().size(), 1);
        Assert.assertTrue(currentPrice.getBpi().containsKey("USD"));
        Assert.assertEquals(currentPrice.getBpi().get("USD").getRateFloat(), new BigDecimal("21674.7828"));

    }

    @Test
    public void testGetFullUrl() {
        Assert.assertEquals(client.getFullUrl(),"https://dummy.com/v1/currentprice/USD.json");
    }

    @Test(expectedExceptions = ValidationException.class,
    expectedExceptionsMessageRegExp = "Invalid base-url")
    public void testInvalidCurrency() {
        new CurrentPriceClient.Builder()
                .baseUrl("wss://dummy.com/v1")
                .currency("USD")
                .build();
    }

    @Test(expectedExceptions = ValidationException.class,
    expectedExceptionsMessageRegExp = "Requested currency is not supported or is invalid")
    public void testInvalidBaseUrl() {
        new CurrentPriceClient.Builder()
                .baseUrl("https://dummy.com/v1")
                .currency("ZZZ")
                .build();
    }
}
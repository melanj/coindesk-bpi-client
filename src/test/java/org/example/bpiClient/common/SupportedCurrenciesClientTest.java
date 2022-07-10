package org.example.bpiClient.common;

import org.example.bpiClient.model.SupportedCurrency;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SupportedCurrenciesClientTest extends JsonResponseMockedTest {

    private JsonClient<SupportedCurrency[]> client;

    @BeforeMethod
    public void setup() {
        client = new SupportedCurrenciesClient("https://dummy.com/v1");
    }

    @Test
    public void testInvoke() throws Exception {
        SupportedCurrency[] supportedCurrencies = client.invoke();
        Assert.assertNotNull(supportedCurrencies);
        Assert.assertEquals(supportedCurrencies.length,165);
    }

    @Test
    public void testGetFullUrl() {
        Assert.assertEquals(client.getFullUrl(), "https://dummy.com/v1/supported-currencies.json");
    }
}
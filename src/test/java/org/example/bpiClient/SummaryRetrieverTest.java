package org.example.bpiClient;

import org.example.bpiClient.common.JsonResponseMockedTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.math.BigDecimal;

public class SummaryRetrieverTest extends JsonResponseMockedTest {

    private SummaryRetriever summaryRetriever;

    @BeforeMethod
    public void setup() throws Exception {
        summaryRetriever = new SummaryRetriever("https://dummy.com/v1/bpi", "USD", 30);
    }

    @Test
    public void testGetCurrency() {
        Assert.assertEquals(summaryRetriever.getCurrency(), "USD");
    }

    @Test
    public void testGetCurrentRate() {
        Assert.assertEquals(summaryRetriever.getCurrentRate(), new BigDecimal("21674.7828"));
    }

    @Test
    public void testGetLowestRate() {
        Assert.assertEquals(summaryRetriever.getLowestRate(), new BigDecimal("18329.0317"));
    }

    @Test
    public void testGetHighestRate() {
        Assert.assertEquals(summaryRetriever.getHighestRate(), new BigDecimal("26172.1405"));
    }
}
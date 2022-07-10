package org.example.bpiClient.model;

import com.google.gson.Gson;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.example.bpiClient.common.TestData;
import org.meanbean.test.BeanTester;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CurrentPriceTest {

    @Test
    public void getterAndSetterCorrectness() {
        new BeanTester().testBean(CurrentPrice.class);
    }

    @Test
    public void equalsAndHashCodeContract() {
        EqualsVerifier.forClass(CurrentPrice.class)
                .suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS, Warning.BIGDECIMAL_EQUALITY).verify();
    }

    @Test
    public void testToStringNoValuesSet() {
        CurrentPrice price = new CurrentPrice();
        Assert.assertEquals(price.toString(), "CurrentPrice(disclaimer=null, updatedTime=null, bpi=null)");
    }

    @Test
    public void testToStringAllValuesSet() {
        final Gson gson = new Gson();
        final CurrentPrice currentPrice = gson.fromJson(TestData.CURRENT_DATA, CurrentPrice.class);
        Assert.assertEquals(currentPrice.toString(),
                "CurrentPrice(disclaimer=This data was produced from the CoinDesk Bitcoin Price Index (USD). " +
                        "Non-USD currency data converted using hourly conversion rate from openexchangerates.org, " +
                        "updatedTime=UpdatedTime(updated=Jul 9, 2022 17:05:00 UTC, " +
                        "updatedISO=2022-07-09T17:05:00+00:00), " +
                        "bpi={USD=CurrencyRate(code=USD, rate=21,674.7828, " +
                        "description=United States Dollar, rateFloat=21674.7828)})");
    }
}
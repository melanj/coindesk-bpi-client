package org.example.bpiClient.model;

import com.google.gson.Gson;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.example.bpiClient.common.TestData;
import org.meanbean.test.BeanTester;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class CurrencyRateTest {

    @Test
    public void getterAndSetterCorrectness() {
        new BeanTester().testBean(CurrencyRate.class);
    }

    @Test
    public void equalsAndHashCodeContract() {
        EqualsVerifier.forClass(CurrencyRate.class)
                .suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS, Warning.BIGDECIMAL_EQUALITY).verify();
    }

    @Test
    public void testToStringNoValuesSet() {
        final CurrencyRate rate = new CurrencyRate();
        Assert.assertEquals(rate.toString(), "CurrencyRate(code=null, rate=null, description=null, rateFloat=null)");
    }

    @Test
    public void testToStringAllValuesSet() {
        final Gson gson = new Gson();
        final Map<String, CurrencyRate> currencyRateMap = gson.fromJson(TestData.CURRENT_DATA, CurrentPrice.class).getBpi();
        Assert.assertEquals(currencyRateMap.size(), 1);
        Assert.assertTrue(currencyRateMap.containsKey("USD"));
        CurrencyRate currencyRate = currencyRateMap.get("USD");
        Assert.assertEquals(currencyRate.toString(), "CurrencyRate(code=USD, rate=21,674.7828, " +
                "description=United States Dollar, rateFloat=21674.7828)");
    }
}
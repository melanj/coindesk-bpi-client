package org.example.bpiClient.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.meanbean.test.BeanTester;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SupportedCurrencyTest {
    @Test
    public void getterAndSetterCorrectness() {
        new BeanTester().testBean(SupportedCurrency.class);
    }

    @Test
    public void equalsAndHashCodeContract() {
        EqualsVerifier.forClass(SupportedCurrency.class)
                .suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void testToStringNoValuesSet() {
        SupportedCurrency supportedCurrency = new SupportedCurrency();
        Assert.assertEquals(supportedCurrency.toString(), "SupportedCurrency(currency=null, country=null)");
    }

    @Test
    public void testToStringAllValuesSet() {
        SupportedCurrency supportedCurrency = new SupportedCurrency();
        supportedCurrency.setCurrency("LKR");
        supportedCurrency.setCountry("Sri Lankan Rupee");
        Assert.assertEquals(supportedCurrency.toString(), "SupportedCurrency(currency=LKR, country=Sri Lankan Rupee)");
    }
}
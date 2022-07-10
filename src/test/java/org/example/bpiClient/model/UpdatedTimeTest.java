package org.example.bpiClient.model;

import com.google.gson.Gson;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.example.bpiClient.common.TestData;
import org.meanbean.test.BeanTester;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdatedTimeTest {
    @Test
    public void getterAndSetterCorrectness() {
        new BeanTester().testBean(UpdatedTime.class);
    }

    @Test
    public void equalsAndHashCodeContract() {
        EqualsVerifier.forClass(UpdatedTime.class)
                .suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void testToStringNoValuesSet() {
        UpdatedTime updatedTime = new UpdatedTime();
        Assert.assertEquals(updatedTime.toString(), "UpdatedTime(updated=null, updatedISO=null)");
    }

    @Test
    public void testToStringAllValuesSet() {
        final Gson gson = new Gson();
        UpdatedTime updatedTime = gson.fromJson(TestData.HISTORICAL_DATA, HistoricalData.class).getUpdatedTime();
        Assert.assertEquals(updatedTime.toString(), "UpdatedTime(updated=Jul 9, 2022 17:51:28 UTC, " +
                "updatedISO=2022-07-09T17:51:28+00:00)");
    }
}
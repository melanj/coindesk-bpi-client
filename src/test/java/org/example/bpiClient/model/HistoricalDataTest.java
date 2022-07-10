package org.example.bpiClient.model;

import com.google.gson.Gson;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.example.bpiClient.common.TestData;
import org.meanbean.test.BeanTester;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HistoricalDataTest {
    @Test
    public void getterAndSetterCorrectness() {
        new BeanTester().testBean(HistoricalData.class);
    }

    @Test
    public void equalsAndHashCodeContract() {
        EqualsVerifier.forClass(HistoricalData.class)
                .suppress(Warning.STRICT_INHERITANCE, Warning.NONFINAL_FIELDS).verify();
    }

    @Test
    public void testToStringNoValuesSet() {
        HistoricalData historicalData = new HistoricalData();
        Assert.assertEquals(historicalData.toString(), "HistoricalData(disclaimer=null, updatedTime=null, bpi=null)");
    }

    @Test
    public void testToStringAllValuesSet() {
        final Gson gson = new Gson();
        final HistoricalData historicalData = gson.fromJson(TestData.HISTORICAL_DATA, HistoricalData.class);
        Assert.assertEquals(historicalData.toString(), "HistoricalData(disclaimer=This data was produced from " +
                "the CoinDesk Bitcoin Price Index. BPI value data returned as EUR., " +
                "updatedTime=UpdatedTime(updated=Jul 9, 2022 17:51:28 UTC, updatedISO=2022-07-09T17:51:28+00:00), " +
                "bpi={2022-06-12=26172.1405, 2022-06-13=24166.8164, 2022-06-30=18607.5543, 2022-07-01=18641.9285, " +
                "2022-07-02=18399.0292, 2022-07-03=18329.0317, 2022-07-04=18344.3093, 2022-07-05=19364.2864, 2022-07-06=19415.5529})");
    }
}
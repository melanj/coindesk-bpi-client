package org.example.bpiClient.common;

import org.apache.commons.io.IOUtils;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.testng.annotations.*;

import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

public abstract class JsonResponseMockedTest {

    private static final String URL_PART_CURRENT_PRICE = "currentprice";
    private static final String URL_PART_HISTORICAL = "historical";
    protected MockedStatic<IOUtils> utilities;

    @BeforeMethod
    public void init() {
        utilities = Mockito.mockStatic(IOUtils.class);
        utilities.when(() -> IOUtils.toString(any(URL.class), eq(StandardCharsets.UTF_8)))
                .thenAnswer(invocationOnMock ->
                {
                    String url = invocationOnMock.getArgument(0).toString();
                    return (url.contains(URL_PART_CURRENT_PRICE)) ? TestData.CURRENT_DATA : ((url.contains(URL_PART_HISTORICAL))
                            ? TestData.HISTORICAL_DATA : TestData.SAMPLE_JSON);
                });
    }

    @AfterMethod
    public void clean() {
        if (utilities != null) {
            utilities.close();
        }
    }
}

package org.example.bpiClient;

import org.apache.commons.io.IOUtils;
import org.example.bpiClient.common.JsonResponseMockedTest;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

public class MainTest extends JsonResponseMockedTest {

    @Test
    public void testMainWithValidCurrency() throws Exception {
        String input = "USD";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(new String[]{});
        utilities.verify(() -> IOUtils.toString(any(URL.class), eq(StandardCharsets.UTF_8)), Mockito.times(3));
    }

    @Test
    public void testMainWithValidJavaCurrencyAndNotSupportedInAPI() throws Exception {
        String input = "KYD";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(new String[]{});
        utilities.verify(() -> IOUtils.toString(any(URL.class), eq(StandardCharsets.UTF_8)), Mockito.times(1));
    }

    @Test
    public void testMainWithInvalidCurrencyCalledXXX() throws Exception {
        String input = "XXX";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(new String[]{});
        utilities.verify(() -> IOUtils.toString(any(URL.class), eq(StandardCharsets.UTF_8)), Mockito.never());
    }

    @Test
    public void testMainWithInvalidCurrencyCalledZZZ() throws Exception {
        String input = "ZZZ";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Main.main(new String[]{});
        utilities.verify(() -> IOUtils.toString(any(URL.class), eq(StandardCharsets.UTF_8)), Mockito.never());
    }
}
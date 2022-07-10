package org.example.bpiClient.common;

import lombok.Data;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JsonClientTest extends JsonResponseMockedTest {

    private JsonClient<SampleJson> client;

    @BeforeMethod
    public void setup() {
        client = new JsonClient<>() {
            @Override
            protected String getFullUrl() {
                return "https://dummy.com/v1/bpi/some/dummy/api";
            }
        };
    }

    @Test
    public void testGetFullUrl() {
        Assert.assertEquals(client.getFullUrl(), "https://dummy.com/v1/bpi/some/dummy/api");
    }

    @Test
    public void testInvoke() throws Exception {
        SampleJson data = client.invoke();
        Assert.assertNotNull(data);
        Assert.assertEquals(data.getName(),"John");
        Assert.assertEquals(data.getAge(),30);
    }

    @Test(expectedExceptions = IllegalStateException.class)
    @SuppressWarnings("rawtypes")
    public void testRaw() throws Exception {
        JsonClient rawClient = new JsonClient() {
            @Override
            protected String getFullUrl() {
                return "https://dummy.com/v1/bpi/some/dummy/api";
            }
        };
        rawClient.invoke();
    }

    @Data
    private static class  SampleJson{
        private String name;
        private int age;
    }

}
package org.example.bpiClient.common;

public class TestData {
    public static final String CURRENT_DATA = "{\n" +
            "  \"time\": {\n" +
            "    \"updated\": \"Jul 9, 2022 17:05:00 UTC\",\n" +
            "    \"updatedISO\": \"2022-07-09T17:05:00+00:00\",\n" +
            "    \"updateduk\": \"Jul 9, 2022 at 18:05 BST\"\n" +
            "  },\n" +
            "  \"disclaimer\": \"This data was produced from the CoinDesk Bitcoin Price Index (USD)." +
            " Non-USD currency data converted using hourly conversion rate from openexchangerates.org\",\n" +
            "  \"bpi\": {\n" +
            "    \"USD\": {\n" +
            "      \"code\": \"USD\",\n" +
            "      \"rate\": \"21,674.7828\",\n" +
            "      \"description\": \"United States Dollar\",\n" +
            "      \"rate_float\": 21674.7828\n" +
            "    }\n" +
            "  }\n" +
            "}\n";
    public static final String HISTORICAL_DATA = "{\n" +
                    "  \"bpi\": {\n" +
                    "    \"2022-06-12\": 26172.1405,\n" +
                    "    \"2022-06-13\": 24166.8164,\n" +
                    "    \"2022-06-30\": 18607.5543,\n" +
                    "    \"2022-07-01\": 18641.9285,\n" +
                    "    \"2022-07-02\": 18399.0292,\n" +
                    "    \"2022-07-03\": 18329.0317,\n" +
                    "    \"2022-07-04\": 18344.3093,\n" +
                    "    \"2022-07-05\": 19364.2864,\n" +
                    "    \"2022-07-06\": 19415.5529\n" +
                    "  },\n" +
                    "  \"disclaimer\": \"This data was produced from the CoinDesk Bitcoin Price Index. " +
                    "BPI value data returned as EUR.\",\n" +
                    "  \"time\": {\n" +
                    "    \"updated\": \"Jul 9, 2022 17:51:28 UTC\",\n" +
                    "    \"updatedISO\": \"2022-07-09T17:51:28+00:00\"\n" +
                    "  }\n" +
                    "}\n";
    public static final String SAMPLE_JSON = "{\"name\":\"John\", \"age\":30}";
}

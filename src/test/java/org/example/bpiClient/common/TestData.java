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

    public static final String SUPPORTED_CURRENCIES_DATA = "[{\"currency\":\"AED\",\"country\":\"United Arab Emirates Dirham\"}," +
            "{\"currency\":\"AFN\",\"country\":\"Afghan Afghani\"},{\"currency\":\"ALL\",\"country\":\"Albanian Lek\"}," +
            "{\"currency\":\"AMD\",\"country\":\"Armenian Dram\"},{\"currency\":\"ANG\",\"country\":\"Netherlands Antillean Guilder\"}," +
            "{\"currency\":\"AOA\",\"country\":\"Angolan Kwanza\"},{\"currency\":\"ARS\",\"country\":\"Argentine Peso\"}," +
            "{\"currency\":\"AUD\",\"country\":\"Australian Dollar\"},{\"currency\":\"AWG\",\"country\":\"Aruban Florin\"}," +
            "{\"currency\":\"AZN\",\"country\":\"Azerbaijani Manat\"},{\"currency\":\"BAM\",\"country\":\"Bosnia-Herzegovina Convertible Mark\"}," +
            "{\"currency\":\"BBD\",\"country\":\"Barbadian Dollar\"},{\"currency\":\"BDT\",\"country\":\"Bangladeshi Taka\"}," +
            "{\"currency\":\"BGN\",\"country\":\"Bulgarian Lev\"},{\"currency\":\"BHD\",\"country\":\"Bahraini Dinar\"}," +
            "{\"currency\":\"BIF\",\"country\":\"Burundian Franc\"},{\"currency\":\"BMD\",\"country\":\"Bermudan Dollar\"}," +
            "{\"currency\":\"BND\",\"country\":\"Brunei Dollar\"},{\"currency\":\"BOB\",\"country\":\"Bolivian Boliviano\"}," +
            "{\"currency\":\"BRL\",\"country\":\"Brazilian Real\"},{\"currency\":\"BSD\",\"country\":\"Bahamian Dollar\"}," +
            "{\"currency\":\"BTC\",\"country\":\"Bitcoin\"},{\"currency\":\"BTN\",\"country\":\"Bhutanese Ngultrum\"}," +
            "{\"currency\":\"BWP\",\"country\":\"Botswanan Pula\"},{\"currency\":\"BYR\",\"country\":\"Belarusian Ruble\"}," +
            "{\"currency\":\"BZD\",\"country\":\"Belize Dollar\"},{\"currency\":\"CAD\",\"country\":\"Canadian Dollar\"}," +
            "{\"currency\":\"CDF\",\"country\":\"Congolese Franc\"},{\"currency\":\"CHF\",\"country\":\"Swiss Franc\"}," +
            "{\"currency\":\"CLF\",\"country\":\"Chilean Unit of Account (UF)\"},{\"currency\":\"CLP\",\"country\":\"Chilean Peso\"}," +
            "{\"currency\":\"CNY\",\"country\":\"Chinese Yuan\"},{\"currency\":\"COP\",\"country\":\"Colombian Peso\"}," +
            "{\"currency\":\"CRC\",\"country\":\"Costa Rican Col\\u00f3n\"},{\"currency\":\"CUP\",\"country\":\"Cuban Peso\"}," +
            "{\"currency\":\"CVE\",\"country\":\"Cape Verdean Escudo\"},{\"currency\":\"CZK\",\"country\":\"Czech Republic Koruna\"}," +
            "{\"currency\":\"DJF\",\"country\":\"Djiboutian Franc\"},{\"currency\":\"DKK\",\"country\":\"Danish Krone\"}," +
            "{\"currency\":\"DOP\",\"country\":\"Dominican Peso\"},{\"currency\":\"DZD\",\"country\":\"Algerian Dinar\"}," +
            "{\"currency\":\"EEK\",\"country\":\"Estonian Kroon\"},{\"currency\":\"EGP\",\"country\":\"Egyptian Pound\"}," +
            "{\"currency\":\"ERN\",\"country\":\"Eritrean Nnakfa\"},{\"currency\":\"ETB\",\"country\":\"Ethiopian Birr\"}," +
            "{\"currency\":\"EUR\",\"country\":\"Euro\"},{\"currency\":\"FJD\",\"country\":\"Fijian Dollar\"}," +
            "{\"currency\":\"FKP\",\"country\":\"Falkland Islands Pound\"},{\"currency\":\"GBP\",\"country\":\"British Pound Sterling\"}," +
            "{\"currency\":\"GEL\",\"country\":\"Georgian Lari\"},{\"currency\":\"GHS\",\"country\":\"Ghanaian Cedi\"}," +
            "{\"currency\":\"GIP\",\"country\":\"Gibraltar Pound\"},{\"currency\":\"GMD\",\"country\":\"Gambian Dalasi\"}," +
            "{\"currency\":\"GNF\",\"country\":\"Guinean Franc\"},{\"currency\":\"GTQ\",\"country\":\"Guatemalan Quetzal\"}," +
            "{\"currency\":\"GYD\",\"country\":\"Guyanaese Dollar\"},{\"currency\":\"HKD\",\"country\":\"Hong Kong Dollar\"}," +
            "{\"currency\":\"HNL\",\"country\":\"Honduran Lempira\"},{\"currency\":\"HRK\",\"country\":\"Croatian Kuna\"}," +
            "{\"currency\":\"HTG\",\"country\":\"Haitian Gourde\"},{\"currency\":\"HUF\",\"country\":\"Hungarian Forint\"}," +
            "{\"currency\":\"IDR\",\"country\":\"Indonesian Rupiah\"},{\"currency\":\"ILS\",\"country\":\"Israeli New Sheqel\"}," +
            "{\"currency\":\"INR\",\"country\":\"Indian Rupee\"},{\"currency\":\"IQD\",\"country\":\"Iraqi Dinar\"}," +
            "{\"currency\":\"IRR\",\"country\":\"Iranian Rial\"},{\"currency\":\"ISK\",\"country\":\"Icelandic Kr\\u00f3na\"}," +
            "{\"currency\":\"JEP\",\"country\":\"Jersey Pound\"},{\"currency\":\"JMD\",\"country\":\"Jamaican Dollar\"}," +
            "{\"currency\":\"JOD\",\"country\":\"Jordanian Dinar\"},{\"currency\":\"JPY\",\"country\":\"Japanese Yen\"}," +
            "{\"currency\":\"KES\",\"country\":\"Kenyan Shilling\"},{\"currency\":\"KGS\",\"country\":\"Kyrgystani Som\"}," +
            "{\"currency\":\"KHR\",\"country\":\"Cambodian Riel\"},{\"currency\":\"KMF\",\"country\":\"Comorian Franc\"}," +
            "{\"currency\":\"KPW\",\"country\":\"North Korean Won\"},{\"currency\":\"KRW\",\"country\":\"South Korean Won\"}," +
            "{\"currency\":\"KZT\",\"country\":\"Kazakhstani Tenge\"},{\"currency\":\"LAK\",\"country\":\"Laotian Kip\"}," +
            "{\"currency\":\"LBP\",\"country\":\"Lebanese Pound\"},{\"currency\":\"LKR\",\"country\":\"Sri Lankan Rupee\"}," +
            "{\"currency\":\"LRD\",\"country\":\"Liberian Dollar\"},{\"currency\":\"LSL\",\"country\":\"Lesotho Loti\"}," +
            "{\"currency\":\"LTL\",\"country\":\"Lithuanian Litas\"},{\"currency\":\"LVL\",\"country\":\"Latvian Lats\"}," +
            "{\"currency\":\"LYD\",\"country\":\"Libyan Dinar\"},{\"currency\":\"MAD\",\"country\":\"Moroccan Dirham\"}," +
            "{\"currency\":\"MDL\",\"country\":\"Moldovan Leu\"},{\"currency\":\"MGA\",\"country\":\"Malagasy Ariary\"}," +
            "{\"currency\":\"MKD\",\"country\":\"Macedonian Denar\"},{\"currency\":\"MMK\",\"country\":\"Myanma Kyat\"}," +
            "{\"currency\":\"MNT\",\"country\":\"Mongolian Tugrik\"},{\"currency\":\"MOP\",\"country\":\"Macanese Pataca\"}," +
            "{\"currency\":\"MRO\",\"country\":\"Mauritanian Ouguiya\"},{\"currency\":\"MTL\",\"country\":\"Maltese Lira\"}," +
            "{\"currency\":\"MUR\",\"country\":\"Mauritian Rupee\"},{\"currency\":\"MVR\",\"country\":\"Maldivian Rufiyaa\"}," +
            "{\"currency\":\"MWK\",\"country\":\"Malawian Kwacha\"},{\"currency\":\"MXN\",\"country\":\"Mexican Peso\"}," +
            "{\"currency\":\"MYR\",\"country\":\"Malaysian Ringgit\"},{\"currency\":\"MZN\",\"country\":\"Mozambican Metical\"}," +
            "{\"currency\":\"NAD\",\"country\":\"Namibian Dollar\"},{\"currency\":\"NGN\",\"country\":\"Nigerian Naira\"}," +
            "{\"currency\":\"NIO\",\"country\":\"Nicaraguan C\\u00f3rdoba\"},{\"currency\":\"NOK\",\"country\":\"Norwegian Krone\"}," +
            "{\"currency\":\"NPR\",\"country\":\"Nepalese Rupee\"},{\"currency\":\"NZD\",\"country\":\"New Zealand Dollar\"}," +
            "{\"currency\":\"OMR\",\"country\":\"Omani Rial\"},{\"currency\":\"PAB\",\"country\":\"Panamanian Balboa\"}," +
            "{\"currency\":\"PEN\",\"country\":\"Peruvian Nuevo Sol\"},{\"currency\":\"PGK\",\"country\":\"Papua New Guinean Kina\"}," +
            "{\"currency\":\"PHP\",\"country\":\"Philippine Peso\"},{\"currency\":\"PKR\",\"country\":\"Pakistani Rupee\"}," +
            "{\"currency\":\"PLN\",\"country\":\"Polish Zloty\"},{\"currency\":\"PYG\",\"country\":\"Paraguayan Guarani\"}," +
            "{\"currency\":\"QAR\",\"country\":\"Qatari Rial\"},{\"currency\":\"RON\",\"country\":\"Romanian Leu\"}," +
            "{\"currency\":\"RSD\",\"country\":\"Serbian Dinar\"},{\"currency\":\"RUB\",\"country\":\"Russian Ruble\"}," +
            "{\"currency\":\"RWF\",\"country\":\"Rwandan Franc\"},{\"currency\":\"SAR\",\"country\":\"Saudi Riyal\"}," +
            "{\"currency\":\"SBD\",\"country\":\"Solomon Islands Dollar\"},{\"currency\":\"SCR\",\"country\":\"Seychellois Rupee\"}," +
            "{\"currency\":\"SDG\",\"country\":\"Sudanese Pound\"},{\"currency\":\"SEK\",\"country\":\"Swedish Krona\"}," +
            "{\"currency\":\"SGD\",\"country\":\"Singapore Dollar\"},{\"currency\":\"SHP\",\"country\":\"Saint Helena Pound\"}," +
            "{\"currency\":\"SLL\",\"country\":\"Sierra Leonean Leone\"},{\"currency\":\"SOS\",\"country\":\"Somali Shilling\"}," +
            "{\"currency\":\"SRD\",\"country\":\"Surinamese Dollar\"}," +
            "{\"currency\":\"STD\",\"country\":\"S\\u00e3o Tom\\u00e9 and Pr\\u00edncipe Dobra\"}," +
            "{\"currency\":\"SVC\",\"country\":\"Salvadoran Col\\u00f3n\"},{\"currency\":\"SYP\",\"country\":\"Syrian Pound\"}," +
            "{\"currency\":\"SZL\",\"country\":\"Swazi Lilangeni\"},{\"currency\":\"THB\",\"country\":\"Thai Baht\"}," +
            "{\"currency\":\"TJS\",\"country\":\"Tajikistani Somoni\"},{\"currency\":\"TMT\",\"country\":\"Turkmenistani Manat\"}," +
            "{\"currency\":\"TND\",\"country\":\"Tunisian Dinar\"},{\"currency\":\"TOP\",\"country\":\"Tongan Pa?anga\"}," +
            "{\"currency\":\"TRY\",\"country\":\"Turkish Lira\"},{\"currency\":\"TTD\",\"country\":\"Trinidad and Tobago Dollar\"}," +
            "{\"currency\":\"TWD\",\"country\":\"New Taiwan Dollar\"},{\"currency\":\"TZS\",\"country\":\"Tanzanian Shilling\"}," +
            "{\"currency\":\"UAH\",\"country\":\"Ukrainian Hryvnia\"},{\"currency\":\"UGX\",\"country\":\"Ugandan Shilling\"}," +
            "{\"currency\":\"USD\",\"country\":\"United States Dollar\"},{\"currency\":\"UYU\",\"country\":\"Uruguayan Peso\"}," +
            "{\"currency\":\"UZS\",\"country\":\"Uzbekistan Som\"},{\"currency\":\"VEF\",\"country\":\"Venezuelan Bol\\u00edvar Fuerte\"}," +
            "{\"currency\":\"VND\",\"country\":\"Vietnamese Dong\"},{\"currency\":\"VUV\",\"country\":\"Vanuatu Vatu\"}," +
            "{\"currency\":\"WST\",\"country\":\"Samoan Tala\"},{\"currency\":\"XAF\",\"country\":\"CFA Franc BEAC\"}," +
            "{\"currency\":\"XAG\",\"country\":\"Silver (troy ounce)\"},{\"currency\":\"XAU\",\"country\":\"Gold (troy ounce)\"}," +
            "{\"currency\":\"XBT\",\"country\":\"Bitcoin\"},{\"currency\":\"XCD\",\"country\":\"East Caribbean Dollar\"}," +
            "{\"currency\":\"XDR\",\"country\":\"Special Drawing Rights\"},{\"currency\":\"XOF\",\"country\":\"CFA Franc BCEAO\"}," +
            "{\"currency\":\"XPF\",\"country\":\"CFP Franc\"},{\"currency\":\"YER\",\"country\":\"Yemeni Rial\"}," +
            "{\"currency\":\"ZAR\",\"country\":\"South African Rand\"},{\"currency\":\"ZMK\",\"country\":\"Zambian Kwacha (pre-2013)\"}," +
            "{\"currency\":\"ZMW\",\"country\":\"Zambian Kwacha\"},{\"currency\":\"ZWL\",\"country\":\"Zimbabwean Dollar\"}]";

    public static final String SAMPLE_JSON = "{\"name\":\"John\", \"age\":30}";
}

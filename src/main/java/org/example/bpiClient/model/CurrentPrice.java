package org.example.bpiClient.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Map;

/**
 * This class represents bitcoin pricing index current price.
 */
@Data
public class CurrentPrice {
    private String disclaimer;
    @SerializedName("time")
    private UpdatedTime updatedTime;
    private Map<String, CurrencyRate> bpi;
}

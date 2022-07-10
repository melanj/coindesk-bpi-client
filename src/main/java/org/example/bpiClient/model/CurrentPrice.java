package org.example.bpiClient.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Map;

@Data
public class CurrentPrice {
    private String disclaimer;
    @SerializedName("time")
    private UpdatedTime updatedTime;
    private Map<String, CurrencyRate> bpi;
}

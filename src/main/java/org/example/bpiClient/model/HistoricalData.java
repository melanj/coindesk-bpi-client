package org.example.bpiClient.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
public class HistoricalData {
    private String disclaimer;
    @SerializedName("time")
    private UpdatedTime updatedTime;
    private Map<String, BigDecimal> bpi;
}

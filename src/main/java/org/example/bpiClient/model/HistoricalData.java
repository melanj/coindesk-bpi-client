package org.example.bpiClient.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

/**
 * This class represents bitcoin pricing index historical data.
 */
@Data
public class HistoricalData {
    private String disclaimer;
    @SerializedName("time")
    private UpdatedTime updatedTime;
    private Map<String, BigDecimal> bpi;
}

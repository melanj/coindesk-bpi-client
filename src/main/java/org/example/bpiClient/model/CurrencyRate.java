package org.example.bpiClient.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * This class represents currency rate used in curren price and historical data classes.
 */
@Data
public class CurrencyRate {
    private String code;
    private String rate;
    private String description;
    @SerializedName("rate_float")
    private BigDecimal rateFloat;
}

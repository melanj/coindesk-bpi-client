package org.example.bpiClient.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyRate {
    private String code;
    private String rate;
    private String description;
    @SerializedName("rate_float")
    private BigDecimal rateFloat;
}

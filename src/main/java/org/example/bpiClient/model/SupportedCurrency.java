package org.example.bpiClient.model;

import lombok.Data;

/**
 * This class represents supported currencies.
 */
@Data
public class SupportedCurrency {
    private String currency;
    private String country;
}

package org.example.bpiClient.model;

import lombok.Data;

/**
 * This class represents updated time used in curren price and historical data classes.
 */
@Data
public class UpdatedTime {
    private String updated;
    private String updatedISO;
}

package org.example.bpiClient.common;

import org.apache.commons.validator.routines.UrlValidator;

import java.time.LocalDate;
import java.util.Currency;

/**
 * Provide utility functions for validating common data types.
 */
public class CommonUtils {

    private static final int UNKNOWN_CURRENCY_CODE = 999;

    private CommonUtils() {
    }

    /**
     * Checks if a field has a valid currency code.
     * @param currency the currency code validation is being performed on.
     * @return true if the currency is valid.
     */
    public static boolean isValidCurrency(String currency) {
        try {
            return Currency.getInstance(currency).getNumericCode() != UNKNOWN_CURRENCY_CODE;
        } catch (IllegalArgumentException ignored) {
            return false;
        }
    }

    /**
     * Checks if a field has a valid currency, throws ValidationException if the currency is invalid.
     * @param currency the currency code validation is being performed on.
     */
    public static void validateCurrency(String currency) {
        if (!isValidCurrency(currency)) {
            throw new ValidationException("Requested currency is not supported or is invalid");
        }
    }

    /**
     * Checks if a field has a valid url address, throws ValidationException if the url is invalid.
     * @param url url the string validation is being performed on.
     */
    public static void validateUrl(String url) {
        if (!UrlValidator.getInstance().isValid(url)) {
            throw new ValidationException("Invalid base-url");
        }
    }

    /**
     * Checks if a range is valid, throws ValidationException if the range is invalid.
     * @param start the start of the range.
     * @param end  the start of the range.
     */
    public static void validateDateRange(LocalDate start, LocalDate end) {
        if (start == null || end == null) {
            throw new ValidationException("The start date or the end date cannot be null");
        }
        if (start.isAfter(end)) {
            throw new ValidationException("The start date should be before the end date");
        }
    }
}

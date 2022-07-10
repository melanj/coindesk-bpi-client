package org.example.bpiClient.common;

import org.apache.commons.validator.routines.UrlValidator;

import java.time.LocalDate;
import java.util.Currency;

public class CommonUtils {

    private static final int UNKNOWN_CURRENCY_CODE = 999;

    private CommonUtils() {
    }

    public static boolean isValidCurrency(String currency) {
        try {
            return Currency.getInstance(currency).getNumericCode() != UNKNOWN_CURRENCY_CODE;
        } catch (IllegalArgumentException ignored) {
            return false;
        }
    }

    public static void validateCurrency(String currency) {
        if (!isValidCurrency(currency)) {
            throw new ValidationException("Requested currency is not supported or is invalid");
        }
    }

    public static void validateUrl(String url) {
        if (!UrlValidator.getInstance().isValid(url)) {
            throw new ValidationException("Invalid base-url");
        }
    }

    public static void validateDateRange(LocalDate start, LocalDate end) {
        if (start == null || end == null) {
            throw new ValidationException("The start date or the end date cannot be null");
        }
        if(start.isAfter(end)){
            throw new ValidationException("The start date should be before the end date");
        }
    }
}

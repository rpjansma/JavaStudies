package com.javatechniques.normalization;

import java.util.Locale;

public class Normalization {

    //Is a technique to parse all data before search into, so you
    //will search only 1 time for 1 pattern in your data.

    public static String normalizeString(String textToBeNormalized) {
        return textToBeNormalized.toLowerCase(Locale.ROOT).trim().replace(",", "");
    }
}

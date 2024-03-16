package com.example.fintechlab1.Services;

public class CalculationService {
    public static final int VALIDATION_FAILED = -1;

    public static int getCharactersCount(String text){
        if (text == null || text.isEmpty()) {
            return VALIDATION_FAILED;
        }

        return text.length();
    }

    public static int getWordsCount(String text) {
        if (text == null || text.isEmpty()) {
            return VALIDATION_FAILED;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }
}

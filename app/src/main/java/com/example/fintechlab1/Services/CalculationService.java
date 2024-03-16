package com.example.fintechlab1.Services;

public class CalculationService {
    public static int getCharactersCount(String text){
        return text.length();
    }

    public static int getWordsCount(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}

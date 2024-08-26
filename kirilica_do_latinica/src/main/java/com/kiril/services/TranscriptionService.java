package com.kiril.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TranscriptionService {

    @Autowired
    private Map<Character, String> translator;

    @Autowired
    private Map<String, Character> reversor;

    public String latinToCyrlic(String latinLine) {

        String processedLine = replaceDoubledLatinCharacters(latinLine);
        StringBuilder response = new StringBuilder();

        for (char currentCharacter : processedLine.toCharArray()) {
            response.append(reversor.getOrDefault(String.valueOf(currentCharacter), currentCharacter));
        }

        return response.toString();
    }

    public String cyrlicToLatin(String cyrlicLine) {

        StringBuilder response = new StringBuilder();

        for (char currentCharacter : cyrlicLine.toCharArray()) {
            response.append(translator.getOrDefault(currentCharacter, String.valueOf(currentCharacter)));
        }

        return response.toString();
    }

    private static String replaceDoubledLatinCharacters(String latinLine) {
        return latinLine
                .replace("sht", "щ").replace("Sht", "Щ").replace("SHt", "Щ").replace("SHT", "Щ")
                .replace("sh", "ш").replace("Sh", "Ш").replace("SH", "Ш")
                .replace("ch", "ч").replace("Ch", "Ч").replace("CH", "Ч")
                .replace("ya", "я").replace("Ya", "Я").replace("YA", "Я")
                .replace("yu", "ю").replace("Yu", "Ю").replace("YU", "Ю");
    }

}

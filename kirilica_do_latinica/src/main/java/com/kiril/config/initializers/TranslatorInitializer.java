package com.kiril.config.initializers;

import java.util.Map;

public class TranslatorInitializer {

    public static void initialize(Map<Character, String> translator) {

        // Uppercase characters
        translator.put('А', "A");
        translator.put('Б', "B");
        translator.put('В', "V");
        translator.put('Г', "G");
        translator.put('Д', "D");
        translator.put('Е', "E");
        translator.put('Ё', "Yo");
        translator.put('Ж', "J");
        translator.put('З', "Z");
        translator.put('И', "I");
        translator.put('Й', "Y");
        translator.put('К', "K");
        translator.put('Л', "L");
        translator.put('М', "M");
        translator.put('Н', "N");
        translator.put('О', "O");
        translator.put('П', "P");
        translator.put('Р', "R");
        translator.put('С', "S");
        translator.put('Т', "T");
        translator.put('У', "U");
        translator.put('Ф', "F");
        translator.put('Х', "H");
        translator.put('Ц', "C");
        translator.put('Ч', "Ch");
        translator.put('Ш', "Sh");
        translator.put('Щ', "Sht");
        translator.put('Ъ', "U");
        translator.put('Ы', "Y");
        translator.put('Ь', "Io");
        translator.put('Э', "E");
        translator.put('Ю', "Yu");
        translator.put('Я', "Q");

        // Lowercase characters
        translator.put('а', "a");
        translator.put('б', "b");
        translator.put('в', "v");
        translator.put('г', "g");
        translator.put('д', "d");
        translator.put('е', "e");
        translator.put('ё', "yo");
        translator.put('ж', "j");
        translator.put('з', "z");
        translator.put('и', "i");
        translator.put('й', "y");
        translator.put('к', "k");
        translator.put('л', "l");
        translator.put('м', "m");
        translator.put('н', "n");
        translator.put('о', "o");
        translator.put('п', "p");
        translator.put('р', "r");
        translator.put('с', "s");
        translator.put('т', "t");
        translator.put('у', "u");
        translator.put('ф', "f");
        translator.put('х', "h");
        translator.put('ц', "c");
        translator.put('ч', "ch");
        translator.put('ш', "sh");
        translator.put('щ', "sht");
        translator.put('ъ', "");
        translator.put('ы', "y");
        translator.put('ь', "io");
        translator.put('э', "e");
        translator.put('ю', "yu");
        translator.put('я', "q");
    }
}
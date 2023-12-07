package org.example;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CharacterCounter {
    public static void charCount(String quote) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] letterArray = quote.toLowerCase().toCharArray();

        //write a loop so that if letter is present as key in charCountMap, it's value increases by one
        //otherwise, add the letter to the hashmap as a key with the value 1
        for (char letter : letterArray) {
            if (Character.isLetter(letter)) {
                if (charCountMap.containsKey(letter)) {
                    charCountMap.put(letter, charCountMap.get(letter) + 1);
                } else {
                    charCountMap.put(letter, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> mapping : charCountMap.entrySet()) {
            System.out.println(mapping.getKey() + ": " + mapping.getValue());
        }
    }
}


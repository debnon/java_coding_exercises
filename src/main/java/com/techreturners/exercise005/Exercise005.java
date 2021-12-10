package com.techreturners.exercise005;

import java.util.Map;
import java.util.HashMap;

public class Exercise005 {

    public boolean isPangram(String input) {
        Map<String, Integer> alphabet = new HashMap<String, Integer>(); 
            
        for (char c = 'A'; c <= 'Z'; c++) 
            alphabet.put(String.valueOf(c), 0);

        input = input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            String letter = input.substring(i,i+1);

            if (alphabet.containsKey(letter) && alphabet.get(letter).equals(0)) {
                alphabet.put(letter, alphabet.get(letter) + 1);
            }
        }

        for (Integer freq : alphabet.values()) {
            
            if (freq.equals(0)) {
                return false;
            }
        }

        return true;
    }

}

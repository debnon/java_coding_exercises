package com.techreturners.exercise005;

import java.util.Map;
import java.util.HashMap;

public class Exercise005 {

    public boolean isPangram(String input) {
        Map<String, Integer> alphabet = new HashMap<String, Integer>() {
            {
                for (char c = 'A'; c <= 'Z'; ++c) 
                    put(String.valueOf(c), 0); 
            }
        };
        // System.out.println(alphabet);

        input = input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            String letter = input.substring(i,i+1);
            // String letter = new StringBuffer(input.charAt(i)).toString();

            System.out.println("Letter" + letter);
            if (alphabet.containsKey(letter) && alphabet.get(letter) == 0) {
                alphabet.put(letter, alphabet.get(letter) + 1);
            }
        }

        for (int freq : alphabet.values()) {
            if (freq == 0) {
                return false;
            }
        }

        return true;
    }

}

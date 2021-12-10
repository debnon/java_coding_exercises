package com.techreturners.exercise003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

public class Exercise003 {


    int getIceCreamCode(String iceCreamFlavour) {
        String [] iceCreamList = iceCreamFlavours();

        int count = 0;
        for (String flavour : iceCreamList) {
            if (iceCreamFlavour.equals(flavour)){
                return count;
            }
            count++;
        }

        return count;
    }

    String[] iceCreamFlavours() {
        String [] iceCreamList = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return iceCreamList;
    }

}

package com.techreturners.exercise003;

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

        return new String[]{ "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
    }

}

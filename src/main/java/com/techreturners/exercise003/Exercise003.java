package com.techreturners.exercise003;

import java.util.ArrayList;

public class Exercise003 {


    int getIceCreamCode(String iceCreamFlavour) {
        // String [] iceCreamList;
        // iceCreamList = iceCreamFlavours();
        // for (String flavour : iceCreamList) {
        //     if (flavour == "Chocolate") {
        //         return 0;
        //     } else if (flavour == "Chocolate") {

        //     }
        // }
        String flavour = iceCreamFlavour;
        if (flavour == "Pistachio") {
            return 0;
        } else if (flavour == "Raspberry Ripple") {
            return 1;
        } else if (flavour == "Vanilla") {
            return 2;
        } else if (flavour == "Mint Chocolate Chip") {
            return 3;
        } else if (flavour == "Chocolate") {
            return 4;
        } else {
            return 5;
        }
        
        // throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

    String[] iceCreamFlavours() {
        String [] iceCreamList = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };
        return iceCreamList;
    }

}

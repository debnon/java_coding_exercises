package com.techreturners.exercise001;


import java.util.List;
import java.text.DecimalFormat;


public class Exercise001 {
    public String capitalizeWord(String word) {
        
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {

        originalPrice += originalPrice * vatRate / 100;
        DecimalFormat priceFormat = new DecimalFormat("#.##");
        double newPrice = Double.parseDouble(priceFormat.format(originalPrice));

        return newPrice;
    }

    public String reverse(String sentence) {
        
        return new StringBuffer(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {

        int count = 0;
        for (User user : users) {
            if (user.getType().equals("Linux")) {
                count++;
            }
        }

        return count;
    }
}

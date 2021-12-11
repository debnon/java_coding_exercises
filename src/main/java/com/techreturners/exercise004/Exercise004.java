package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Exercise004 {

    private LocalDateTime currentDateTime;
    
    public Exercise004(LocalDate date) {

        currentDateTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        currentDateTime = dateTime;
    }

    public Exercise004(LocalTime time) {
        LocalDate date = LocalDate.of(0, Month.JANUARY, 1); 
        currentDateTime = time.atDate(date);
    }


    public LocalDateTime getDateTime() {
        final long GIGA_SECOND = 1000000000;
        currentDateTime = currentDateTime.plusSeconds(GIGA_SECOND);
        
        return currentDateTime;
    }
}




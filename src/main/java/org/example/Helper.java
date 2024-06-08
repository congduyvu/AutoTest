package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Helper {

    public String AddCurrentDate()
    {
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
        String currentDateTime = currentDate.format(formatter);
        return currentDateTime;
    }
}

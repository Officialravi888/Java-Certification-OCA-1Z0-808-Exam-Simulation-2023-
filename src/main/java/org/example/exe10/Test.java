package org.example.exe10;

import java.time.LocalDate;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        LocalDate date=LocalDate.parse("2023-03-31");
        LocalTime time=LocalTime.MAX;
        System.out.println(date.atTime(time));
    }
}

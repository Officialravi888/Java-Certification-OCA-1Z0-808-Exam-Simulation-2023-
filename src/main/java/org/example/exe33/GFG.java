package org.example.exe33;

import java.time.LocalTime;

//public class Test {
//    public static void main(String[] args) {
//        LocalTime time=LocalTime.of(16,40);
//        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "AM":"PM";
//        System.out.println(amPm);
//    }
//}
// Java program to convert 24 hour
// time format to 12 hour format

// Importing specific date class libraries
import java.util.Date;
import java.text.SimpleDateFormat;

public class GFG {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Time is : " + date);
        SimpleDateFormat formatTime = new SimpleDateFormat("hh.mm aa");
        String time = formatTime.format(date);
        System.out.println("Current Time in AM/PM Format is : " + time);
    }
}

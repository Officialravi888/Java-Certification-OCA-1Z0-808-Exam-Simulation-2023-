package org.example.exe41;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<LocalDate>localDates=new ArrayList<>();
        localDates.add(LocalDate.parse("2018-07-11"));
        localDates.add(LocalDate.parse("1919-02-25"));
        localDates.add(LocalDate.of(2020, 4, 8));
        localDates.add(LocalDate.of(1980, Month.DECEMBER, 31));
        localDates.removeIf(x -> x.getYear() < 2000);
        System.out.println(localDates);
    }
}

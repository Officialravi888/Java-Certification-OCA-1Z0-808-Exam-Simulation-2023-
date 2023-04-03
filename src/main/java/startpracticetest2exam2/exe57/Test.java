package startpracticetest2exam2.exe57;

import java.time.LocalDate;

public class Test {
    public static void main(String [] args) {
        LocalDate date = LocalDate.parse("1980-03-16");
        System.out.println(date.minusYears(-5));
    }
}

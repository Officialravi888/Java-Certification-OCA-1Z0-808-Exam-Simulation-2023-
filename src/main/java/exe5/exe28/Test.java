package exe5.exe28;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.parse("1983-06-30");
        System.out.println(localDate.plusMonths(8));
    }
}

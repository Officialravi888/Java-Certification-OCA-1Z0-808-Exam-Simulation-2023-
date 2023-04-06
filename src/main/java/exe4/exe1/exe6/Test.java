package exe4.exe1.exe6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> days = new ArrayList<>();
        days.add("SUNDAY");
        days.add("SUNDAY");
        days.add("MONDAY");
        System.out.println(days.size());
        days.clear();
        System.out.println(days.size());
    }
}
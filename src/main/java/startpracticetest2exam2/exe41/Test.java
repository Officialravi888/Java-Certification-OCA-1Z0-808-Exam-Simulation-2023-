package startpracticetest2exam2.exe41;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ONE");
        list.add("TWO");
        list.add("THREE");
        list.add("THREE");

        if (list.remove("THREE")) {
            list.remove("THREE");

        }

        System.out.println(list);
    }
}


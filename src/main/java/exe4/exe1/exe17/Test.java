package exe4.exe1.exe17;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(4);
        list.add(0, "Array");
        list.add(2, "List");

        System.out.println(list);
    }
}
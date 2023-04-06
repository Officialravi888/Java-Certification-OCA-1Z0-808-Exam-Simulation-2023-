package exe4.exe1.exe63;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        List<StringBuilder> list = new ArrayList<>();
        list.add(sb);
        list.add(new StringBuilder("Hello"));
        list.add(sb);
        sb.append("World!");

        System.out.println(list);
    }
}

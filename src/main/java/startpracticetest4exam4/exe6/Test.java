package startpracticetest4exam4.exe6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("SUNDAY");
        list.add("SUNDAY");
        list.add("MONDAY");
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
    }
}

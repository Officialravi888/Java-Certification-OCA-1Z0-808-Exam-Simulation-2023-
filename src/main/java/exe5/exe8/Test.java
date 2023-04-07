package exe5.exe8;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<StringBuilder>list=new ArrayList<>();
        list.add(new StringBuilder("AAA"));
        list.add(new StringBuilder("BBB"));
        list.add(new StringBuilder("AAA"));
        list.removeIf(sb->sb.equals(new StringBuilder("AAA")));
        System.out.println(list);
    }
}

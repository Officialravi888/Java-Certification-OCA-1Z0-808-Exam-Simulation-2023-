package pre.Main;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        Integer []arr={1,2,3,4,4,8,5,7,8};
        Set<Integer> set=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set);
    }
}

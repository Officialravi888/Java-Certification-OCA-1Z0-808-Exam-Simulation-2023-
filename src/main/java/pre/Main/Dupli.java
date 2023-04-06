package pre.Main;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dupli {

    public static void main(String[] args) {
        Integer []arr={1,3,5,6,4,3,2,3,45,5,6,7,3,5,4,343,};
        Set<Integer> set=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set);
//        for (Integer single: set)
//            System.out.print(single);
    }
}

package todo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//public class Duplicate {
//    static Integer []arr={1,2,3,4,5,6,7,4,5,3,2,6,8,9,0};
//    public static void main(String[] args) {
//        Set<Integer> set=new LinkedHashSet<Integer>(Arrays.asList(arr));
//        System.out.println(set);
//    }
//}
//public class Duplicate{
//    public static void main(String[] args) {
//        Integer[]arr={2,4,5,6,7,8,9,4,5,6,78,9};
//        Set<Integer>set=new HashSet<>(Arrays.asList(arr));
//        System.out.println(set);
//    }
//}

public class Duplicate {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 5, 6, 7, 45, 8, 9};
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        for (Integer single : set) {
            System.out.println(single);
        }
    }
}